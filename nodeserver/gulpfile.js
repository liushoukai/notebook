
// Load plugins
var gulp = require('gulp')
  , sass = require('gulp-ruby-sass')
  , autoprefixer = require('gulp-autoprefixer')
  , minifycss = require('gulp-minify-css')
  , jshint = require('gulp-jshint')
  , uglify = require('gulp-uglify')
  , imagemin = require('gulp-imagemin')
  , rename = require('gulp-rename')
  , concat = require('gulp-concat')
  , notify = require('gulp-notify')
  , cache = require('gulp-cache')
  , livereload = require('gulp-livereload')
  , del = require('del')
  , vinylPaths = require('vinyl-paths')
  ;

// Styles Scss
gulp.task('styles:scss', function() {
  return sass('src/styles/main.scss', { style: 'expanded' })
    .pipe(autoprefixer({
        browsers: ['last 2 version']
    }))
    .pipe(gulp.dest('dist/styles'))
    .pipe(rename({suffix: '.min'}))
    .pipe(minifycss())
    .pipe(gulp.dest('dist/styles'))
    .pipe(notify({ message: 'styles:scss task complete' }));
});

// Styles Css
gulp.task('styles:css', function() {
  return gulp.src('src/**/*.css')
    .pipe(autoprefixer({
      browsers: ['last 2 version']
    }))
    .pipe(rename({suffix: '.min'}))
    .pipe(minifycss())
    .pipe(gulp.dest('dist'))
    .pipe(notify({ message: 'styles:css task complete' }));
});

// Scripts
gulp.task('scripts', function() {
  //return gulp.src("src/scripts/**/*.js")
  return gulp.src("src/**/*.js")
    //.pipe(jshint('.jshintrc'))
    .pipe(jshint.reporter('default'))
    //.pipe(concat('main.js'))
    //.pipe(gulp.dest('dist/scripts'))
    .pipe(rename({suffix: ".min"}))
    .pipe(uglify())
    .pipe(gulp.dest('dist'))
    .pipe(notify({ message: 'scripts task complete' }));
});

// Images
gulp.task('images', function() {
  return gulp.src('src/**/*.@(jpg|png)')
    .pipe(imagemin({ optimizationLevel: 3, progressive: true, interlaced: true }))
    .pipe(gulp.dest('dist'))
    .pipe(notify({ message: 'images task complete' }));
});

// Clean
gulp.task('clean', function(cb) {
  return gulp.src('dist')
    .pipe(vinylPaths(del))
    .pipe(notify({ message: 'clean task complete' }));
});

// Default task
gulp.task('default', ['clean', 'scripts', 'styles:css', 'images']);

// Watch
gulp.task('watch', function() {

  // Watch .scss files
  gulp.watch('src/styles/**/*.scss', ['styles']);

  // Watch .js files
  gulp.watch('src/scripts/**/*.js', ['scripts']);

  // Watch image files
  gulp.watch('src/images/**/*', ['images']);

  // Create LiveReload server
  livereload.listen();

  // Watch any files in dist/, reload on change
  gulp.watch(['dist/**']).on('change', livereload.changed);

});


