### 接口说明
#### GET http://wxjy-mingyang.mion.cn/volume/1 
获取ID为1的试题册中试题的信息


- code    返回码，其中success表示接口请求成功，failure表示接口请求失败（注意：接口请求超时等网络问题由前端显示提示内容）；
- message 返回给用户提示信息；
- testVolume 试题册信息，可以理解为试卷，包含多道试题信息，试题信息在test_topics素组中；
- testVolume.test_topics[0]               包含试题信息；
- testVolume.test_topics[0].test_type     代表试题题型，用于试题的分类（参考以下关系表）；
- testVolume.test_topics[0].test_sub_type 实际试题题型，用于试题的分类（参考以下关系表）；
- testVolume.test_topics[0].test_options  包含试题选项信息；
- testVolume.test_topics[0].test_optios[1].option_group 试题选项分组号；
- testVolume.test_topics[0].subTestTopics 阅读子试题信息，子试题结构与试题结构一致；
- testVolume.test_topics[0].is_marked     表示试题是否已标记（0 未标记 1 已标记）；

题型与题型子类型的组合关系表

|test_type  |test_sub_type  |含义
|-----------|---------------|----
|2          |8              |阅读题
|3          |2              |选择题-双空
|3          |1              |选择题-单空
|3          |3              |选择题-三空
|3          |4              |选择题-6选2
|5          |1              |数学题-单选
|5          |7              |数学题-单空
|5          |6              |数学题-分数
|5          |4              |数学题-不定项
|1          |5              |填空题

阅读题子试题分类的组合关系表

|test_type  |test_sub_type  |含义
|-----------|---------------|----
|2          |1              |单项选择题
|2          |4              |不定项选择题
|2          |9              |选句答题 

```json
{
  "code": "failure",
  "message": "请求参数不合法"
}
```

```json
{
  "code": "success",
  "msg": "",
  "testVolume": {
    "id": 1,
    "test_volume_name": "词汇练习册1",
    "subject_id": 1,
    "test_book_id": 1,
    "test_volume_order": 0,
    "total_num": 30,
    "limit_time": 60,
    "order": 3,
    "recommend_time": 1800,
    "type": 0,
    "status": 0,
    "created_at": "2017-12-11 11:58:50",
    "updated_at": "2017-12-19 11:51:06",
    "deleted_at": null,
    "test_topics": [
      {
        "id": 34,
        "subject_id": 0,
        "test_book_id": 0,
        "test_volume_id": 0,
        "parent_id": 0,
        "test_type": 3,
        "test_sub_type": 1,
        "hard_level": 0,
        "type": 1,
        "test_name": "",
        "test_title": "词汇选择题1",
        "test_content": "<p>1.Though we live in an era of stunning scientific achievement, many otherwise educated people remain indifferent to or contemptuous of such achievement, even going so far as to&nbsp;______&nbsp;their ignorance or basic physic.</p>\r\n",
        "best_analysis": "<p>最佳解析</p>\r\n",
        "free_analysis": "<p>免费解析</p>\r\n",
        "order": 0,
        "created_at": "2018-01-11 16:43:40",
        "updated_at": "2018-01-11 16:43:40",
        "deleted_at": null,
        "pivot": {
          "test_volume_id": 1,
          "test_topic_id": 34,
          "created_at": "2018-01-11 16:52:18",
          "updated_at": "2018-01-11 16:52:18",
          "order": 1,
          "id": 6
        },
        "test_options": [
          {
            "id": 26,
            "test_topic_id": 34,
            "option_content": "decry",
            "option_group": 0,
            "option_order": 1,
            "is_answer": 0,
            "created_at": null,
            "updated_at": null,
            "deleted_at": null
          },
          {
            "id": 27,
            "test_topic_id": 34,
            "option_content": "conceal",
            "option_group": 0,
            "option_order": 2,
            "is_answer": 1,
            "created_at": null,
            "updated_at": null,
            "deleted_at": null
          },
          {
            "id": 28,
            "test_topic_id": 34,
            "option_content": "remedy",
            "option_group": 0,
            "option_order": 3,
            "is_answer": 0,
            "created_at": null,
            "updated_at": null,
            "deleted_at": null
          },
          {
            "id": 29,
            "test_topic_id": 34,
            "option_content": "boast of",
            "option_group": 0,
            "option_order": 4,
            "is_answer": 0,
            "created_at": null,
            "updated_at": null,
            "deleted_at": null
          },
          {
            "id": 30,
            "test_topic_id": 34,
            "option_content": "downplay",
            "option_group": 0,
            "option_order": 5,
            "is_answer": 0,
            "created_at": null,
            "updated_at": null,
            "deleted_at": null
          }
        ]
      },
      {},
      {},
      {}
    ]
  }
}
```
#### POST http://wxjy-mingyang.mion.cn/answer
点击上/下一步时提交用户答题与用时信息

- test_volume_id    试题册ID
- test_topic_id     当前试题ID
- time_cost         答题耗时（秒）
- users_answer      试题答案

#### POST http://wxjy-mingyang.mion.cn/mark
添加试题标记

- test_volume_id    当前试题册ID
- test_topic_id     当前试题ID

#### POST http://wxjy-mingyang.mion.cn/unmark
取消试题标记


- test_volume_id    当前试题册ID
- test_topic_id     当前试题ID
