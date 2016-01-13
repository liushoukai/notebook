# Sublime Config

## Usage
Put config files under ~/.config/sublime-text-3/Packages/User.

## Sublime2/3 License

```
—– BEGIN LICENSE —–
Andrew Weber
Single User License
EA7E-855605
813A03DD 5E4AD9E6 6C0EEB94 BC99798F
942194A6 02396E98 E62C9979 4BB979FE
91424C9D A45400BF F6747D88 2FB88078
90F5CC94 1CDC92DC 8457107A F151657B
1D22E383 A997F016 42397640 33F41CFC
E1D0AE85 A0BBD039 0E9C8D55 E1B89D5D
5CDB7036 E56DE1C0 EFCC0840 650CD3A6
B98FC99C 8FAC73EE D2B95564 DF450523
—— END LICENSE ——
```

## Project Manager

Open console via the ctrl+\` shortcut or the View > Show Console menu.

*SUBLIME TEXT3*
```
import urllib.request,os,hashlib; h = '2915d1851351e5ee549c20394736b442' + '8bc59f460fa1548d1514676163dafc88'; pf = 'Package Control.sublime-package'; ipp = sublime.installed_packages_path(); urllib.request.install_opener( urllib.request.build_opener( urllib.request.ProxyHandler()) ); by = urllib.request.urlopen( 'http://packagecontrol.io/' + pf.replace(' ', '%20')).read(); dh = hashlib.sha256(by).hexdigest(); print('Error validating download (got %s instead of %s), please try manual install' % (dh, h)) if dh != h else open(os.path.join( ipp, pf), 'wb' ).write(by)
```

## Recommand Packages
- ``
- `Emmet`
- `Emmet Css Snippets`
- `Compare Side-By-Side`
- `SideBarEnhancements`
- `SublimeCodeIntel`
- `SublimeLinter`
- `Tortoise​SVN`
- `HTML-CSS-JS Prettify`
- `Bootstrap 3 Snippets`




