# 瑞吉外卖


**简介**:瑞吉外卖


**HOST**:localhost:8080


**联系人**:


**Version**:1.0


**接口路径**:/v2/api-docs


[TOC]






# category-controller


## save


**接口地址**:`/category`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "createTime": "",
  "createUser": 0,
  "id": 0,
  "name": "",
  "sort": 0,
  "type": 0,
  "updateTime": "",
  "updateUser": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|category|category|body|true|Category|Category|
|&emsp;&emsp;createTime|||false|string(date-time)||
|&emsp;&emsp;createUser|||false|integer(int64)||
|&emsp;&emsp;id|||false|integer(int64)||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;sort|||false|integer(int32)||
|&emsp;&emsp;type|||false|integer(int32)||
|&emsp;&emsp;updateTime|||false|string(date-time)||
|&emsp;&emsp;updateUser|||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## update


**接口地址**:`/category`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "createTime": "",
  "createUser": 0,
  "id": 0,
  "name": "",
  "sort": 0,
  "type": 0,
  "updateTime": "",
  "updateUser": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|category|category|body|true|Category|Category|
|&emsp;&emsp;createTime|||false|string(date-time)||
|&emsp;&emsp;createUser|||false|integer(int64)||
|&emsp;&emsp;id|||false|integer(int64)||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;sort|||false|integer(int32)||
|&emsp;&emsp;type|||false|integer(int32)||
|&emsp;&emsp;updateTime|||false|string(date-time)||
|&emsp;&emsp;updateUser|||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## delete


**接口地址**:`/category`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|ids|ids|query|false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## list


**接口地址**:`/category/list`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|createTime||query|false|string(date-time)||
|createUser||query|false|integer(int64)||
|id||query|false|integer(int64)||
|name||query|false|string||
|sort||query|false|integer(int32)||
|type||query|false|integer(int32)||
|updateTime||query|false|string(date-time)||
|updateUser||query|false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«List«Category»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|Category|
|&emsp;&emsp;createTime||string(date-time)||
|&emsp;&emsp;createUser||integer(int64)||
|&emsp;&emsp;id||integer(int64)||
|&emsp;&emsp;name||string||
|&emsp;&emsp;sort||integer(int32)||
|&emsp;&emsp;type||integer(int32)||
|&emsp;&emsp;updateTime||string(date-time)||
|&emsp;&emsp;updateUser||integer(int64)||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": [
		{
			"createTime": "",
			"createUser": 0,
			"id": 0,
			"name": "",
			"sort": 0,
			"type": 0,
			"updateTime": "",
			"updateUser": 0
		}
	],
	"map": {},
	"msg": ""
}
```


## page


**接口地址**:`/category/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page|page|query|false|integer(int32)||
|pageSize|pageSize|query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«Page»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Page|Page|
|&emsp;&emsp;countId||string||
|&emsp;&emsp;current||integer(int64)||
|&emsp;&emsp;hitCount||boolean||
|&emsp;&emsp;maxLimit||integer(int64)||
|&emsp;&emsp;optimizeCountSql||boolean||
|&emsp;&emsp;orders||array|OrderItem|
|&emsp;&emsp;&emsp;&emsp;asc||boolean||
|&emsp;&emsp;&emsp;&emsp;column||string||
|&emsp;&emsp;pages||integer(int64)||
|&emsp;&emsp;records||array|object|
|&emsp;&emsp;searchCount||boolean||
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;total||integer(int64)||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"countId": "",
		"current": 0,
		"hitCount": true,
		"maxLimit": 0,
		"optimizeCountSql": true,
		"orders": [
			{
				"asc": true,
				"column": ""
			}
		],
		"pages": 0,
		"records": [],
		"searchCount": true,
		"size": 0,
		"total": 0
	},
	"map": {},
	"msg": ""
}
```


# common-controller


## download


**接口地址**:`/common/download`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name|name|query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## upload


**接口地址**:`/common/upload`


**请求方式**:`POST`


**请求数据类型**:`multipart/form-data`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|file|file|body|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


# dish-controller


## save


**接口地址**:`/dish`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "categoryId": 0,
  "categoryName": "",
  "code": "",
  "copies": 0,
  "createTime": "",
  "createUser": 0,
  "description": "",
  "flavors": [
    {
      "createTime": "",
      "createUser": 0,
      "dishId": 0,
      "id": 0,
      "isDeleted": 0,
      "name": "",
      "updateTime": "",
      "updateUser": 0,
      "value": ""
    }
  ],
  "id": 0,
  "image": "",
  "isDeleted": 0,
  "name": "",
  "price": 0,
  "sort": 0,
  "status": 0,
  "updateTime": "",
  "updateUser": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|dishDto|dishDto|body|true|DishDto|DishDto|
|&emsp;&emsp;categoryId|||false|integer(int64)||
|&emsp;&emsp;categoryName|||false|string||
|&emsp;&emsp;code|||false|string||
|&emsp;&emsp;copies|||false|integer(int32)||
|&emsp;&emsp;createTime|||false|string(date-time)||
|&emsp;&emsp;createUser|||false|integer(int64)||
|&emsp;&emsp;description|||false|string||
|&emsp;&emsp;flavors|||false|array|DishFlavor|
|&emsp;&emsp;&emsp;&emsp;createTime|||false|string||
|&emsp;&emsp;&emsp;&emsp;createUser|||false|integer||
|&emsp;&emsp;&emsp;&emsp;dishId|||false|integer||
|&emsp;&emsp;&emsp;&emsp;id|||false|integer||
|&emsp;&emsp;&emsp;&emsp;isDeleted|||false|integer||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|||false|string||
|&emsp;&emsp;&emsp;&emsp;updateUser|||false|integer||
|&emsp;&emsp;&emsp;&emsp;value|||false|string||
|&emsp;&emsp;id|||false|integer(int64)||
|&emsp;&emsp;image|||false|string||
|&emsp;&emsp;isDeleted|||false|integer(int32)||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;price|||false|number||
|&emsp;&emsp;sort|||false|integer(int32)||
|&emsp;&emsp;status|||false|integer(int32)||
|&emsp;&emsp;updateTime|||false|string(date-time)||
|&emsp;&emsp;updateUser|||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## update


**接口地址**:`/dish`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "categoryId": 0,
  "categoryName": "",
  "code": "",
  "copies": 0,
  "createTime": "",
  "createUser": 0,
  "description": "",
  "flavors": [
    {
      "createTime": "",
      "createUser": 0,
      "dishId": 0,
      "id": 0,
      "isDeleted": 0,
      "name": "",
      "updateTime": "",
      "updateUser": 0,
      "value": ""
    }
  ],
  "id": 0,
  "image": "",
  "isDeleted": 0,
  "name": "",
  "price": 0,
  "sort": 0,
  "status": 0,
  "updateTime": "",
  "updateUser": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|dishDto|dishDto|body|true|DishDto|DishDto|
|&emsp;&emsp;categoryId|||false|integer(int64)||
|&emsp;&emsp;categoryName|||false|string||
|&emsp;&emsp;code|||false|string||
|&emsp;&emsp;copies|||false|integer(int32)||
|&emsp;&emsp;createTime|||false|string(date-time)||
|&emsp;&emsp;createUser|||false|integer(int64)||
|&emsp;&emsp;description|||false|string||
|&emsp;&emsp;flavors|||false|array|DishFlavor|
|&emsp;&emsp;&emsp;&emsp;createTime|||false|string||
|&emsp;&emsp;&emsp;&emsp;createUser|||false|integer||
|&emsp;&emsp;&emsp;&emsp;dishId|||false|integer||
|&emsp;&emsp;&emsp;&emsp;id|||false|integer||
|&emsp;&emsp;&emsp;&emsp;isDeleted|||false|integer||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|||false|string||
|&emsp;&emsp;&emsp;&emsp;updateUser|||false|integer||
|&emsp;&emsp;&emsp;&emsp;value|||false|string||
|&emsp;&emsp;id|||false|integer(int64)||
|&emsp;&emsp;image|||false|string||
|&emsp;&emsp;isDeleted|||false|integer(int32)||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;price|||false|number||
|&emsp;&emsp;sort|||false|integer(int32)||
|&emsp;&emsp;status|||false|integer(int32)||
|&emsp;&emsp;updateTime|||false|string(date-time)||
|&emsp;&emsp;updateUser|||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## list


**接口地址**:`/dish/list`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryId||query|false|integer(int64)||
|code||query|false|string||
|createTime||query|false|string(date-time)||
|createUser||query|false|integer(int64)||
|description||query|false|string||
|id||query|false|integer(int64)||
|image||query|false|string||
|isDeleted||query|false|integer(int32)||
|name||query|false|string||
|price||query|false|number||
|sort||query|false|integer(int32)||
|status||query|false|integer(int32)||
|updateTime||query|false|string(date-time)||
|updateUser||query|false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«List«Dish»»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||array|Dish|
|&emsp;&emsp;categoryId||integer(int64)||
|&emsp;&emsp;code||string||
|&emsp;&emsp;createTime||string(date-time)||
|&emsp;&emsp;createUser||integer(int64)||
|&emsp;&emsp;description||string||
|&emsp;&emsp;id||integer(int64)||
|&emsp;&emsp;image||string||
|&emsp;&emsp;isDeleted||integer(int32)||
|&emsp;&emsp;name||string||
|&emsp;&emsp;price||number||
|&emsp;&emsp;sort||integer(int32)||
|&emsp;&emsp;status||integer(int32)||
|&emsp;&emsp;updateTime||string(date-time)||
|&emsp;&emsp;updateUser||integer(int64)||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": [
		{
			"categoryId": 0,
			"code": "",
			"createTime": "",
			"createUser": 0,
			"description": "",
			"id": 0,
			"image": "",
			"isDeleted": 0,
			"name": "",
			"price": 0,
			"sort": 0,
			"status": 0,
			"updateTime": "",
			"updateUser": 0
		}
	],
	"map": {},
	"msg": ""
}
```


## page


**接口地址**:`/dish/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name|name|query|false|string||
|page|page|query|false|integer(int32)||
|pageSize|pageSize|query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«Page»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Page|Page|
|&emsp;&emsp;countId||string||
|&emsp;&emsp;current||integer(int64)||
|&emsp;&emsp;hitCount||boolean||
|&emsp;&emsp;maxLimit||integer(int64)||
|&emsp;&emsp;optimizeCountSql||boolean||
|&emsp;&emsp;orders||array|OrderItem|
|&emsp;&emsp;&emsp;&emsp;asc||boolean||
|&emsp;&emsp;&emsp;&emsp;column||string||
|&emsp;&emsp;pages||integer(int64)||
|&emsp;&emsp;records||array|object|
|&emsp;&emsp;searchCount||boolean||
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;total||integer(int64)||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"countId": "",
		"current": 0,
		"hitCount": true,
		"maxLimit": 0,
		"optimizeCountSql": true,
		"orders": [
			{
				"asc": true,
				"column": ""
			}
		],
		"pages": 0,
		"records": [],
		"searchCount": true,
		"size": 0,
		"total": 0
	},
	"map": {},
	"msg": ""
}
```


## get


**接口地址**:`/dish/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«DishDto»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||DishDto|DishDto|
|&emsp;&emsp;categoryId||integer(int64)||
|&emsp;&emsp;categoryName||string||
|&emsp;&emsp;code||string||
|&emsp;&emsp;copies||integer(int32)||
|&emsp;&emsp;createTime||string(date-time)||
|&emsp;&emsp;createUser||integer(int64)||
|&emsp;&emsp;description||string||
|&emsp;&emsp;flavors||array|DishFlavor|
|&emsp;&emsp;&emsp;&emsp;createTime||string||
|&emsp;&emsp;&emsp;&emsp;createUser||integer||
|&emsp;&emsp;&emsp;&emsp;dishId||integer||
|&emsp;&emsp;&emsp;&emsp;id||integer||
|&emsp;&emsp;&emsp;&emsp;isDeleted||integer||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;updateTime||string||
|&emsp;&emsp;&emsp;&emsp;updateUser||integer||
|&emsp;&emsp;&emsp;&emsp;value||string||
|&emsp;&emsp;id||integer(int64)||
|&emsp;&emsp;image||string||
|&emsp;&emsp;isDeleted||integer(int32)||
|&emsp;&emsp;name||string||
|&emsp;&emsp;price||number||
|&emsp;&emsp;sort||integer(int32)||
|&emsp;&emsp;status||integer(int32)||
|&emsp;&emsp;updateTime||string(date-time)||
|&emsp;&emsp;updateUser||integer(int64)||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"categoryId": 0,
		"categoryName": "",
		"code": "",
		"copies": 0,
		"createTime": "",
		"createUser": 0,
		"description": "",
		"flavors": [
			{
				"createTime": "",
				"createUser": 0,
				"dishId": 0,
				"id": 0,
				"isDeleted": 0,
				"name": "",
				"updateTime": "",
				"updateUser": 0,
				"value": ""
			}
		],
		"id": 0,
		"image": "",
		"isDeleted": 0,
		"name": "",
		"price": 0,
		"sort": 0,
		"status": 0,
		"updateTime": "",
		"updateUser": 0
	},
	"map": {},
	"msg": ""
}
```


# employee-controller


## save


**接口地址**:`/employee`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "createTime": "",
  "createUser": 0,
  "id": 0,
  "idNumber": "",
  "name": "",
  "password": "",
  "phone": "",
  "sex": "",
  "status": 0,
  "updateTime": "",
  "updateUser": 0,
  "username": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|employee|employee|body|true|Employee|Employee|
|&emsp;&emsp;createTime|||false|string(date-time)||
|&emsp;&emsp;createUser|||false|integer(int64)||
|&emsp;&emsp;id|||false|integer(int64)||
|&emsp;&emsp;idNumber|||false|string||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;sex|||false|string||
|&emsp;&emsp;status|||false|integer(int32)||
|&emsp;&emsp;updateTime|||false|string(date-time)||
|&emsp;&emsp;updateUser|||false|integer(int64)||
|&emsp;&emsp;username|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## update


**接口地址**:`/employee`


**请求方式**:`PUT`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "createTime": "",
  "createUser": 0,
  "id": 0,
  "idNumber": "",
  "name": "",
  "password": "",
  "phone": "",
  "sex": "",
  "status": 0,
  "updateTime": "",
  "updateUser": 0,
  "username": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|employee|employee|body|true|Employee|Employee|
|&emsp;&emsp;createTime|||false|string(date-time)||
|&emsp;&emsp;createUser|||false|integer(int64)||
|&emsp;&emsp;id|||false|integer(int64)||
|&emsp;&emsp;idNumber|||false|string||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;sex|||false|string||
|&emsp;&emsp;status|||false|integer(int32)||
|&emsp;&emsp;updateTime|||false|string(date-time)||
|&emsp;&emsp;updateUser|||false|integer(int64)||
|&emsp;&emsp;username|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## login


**接口地址**:`/employee/login`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "createTime": "",
  "createUser": 0,
  "id": 0,
  "idNumber": "",
  "name": "",
  "password": "",
  "phone": "",
  "sex": "",
  "status": 0,
  "updateTime": "",
  "updateUser": 0,
  "username": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|employee|employee|body|true|Employee|Employee|
|&emsp;&emsp;createTime|||false|string(date-time)||
|&emsp;&emsp;createUser|||false|integer(int64)||
|&emsp;&emsp;id|||false|integer(int64)||
|&emsp;&emsp;idNumber|||false|string||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;sex|||false|string||
|&emsp;&emsp;status|||false|integer(int32)||
|&emsp;&emsp;updateTime|||false|string(date-time)||
|&emsp;&emsp;updateUser|||false|integer(int64)||
|&emsp;&emsp;username|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«Employee»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Employee|Employee|
|&emsp;&emsp;createTime||string(date-time)||
|&emsp;&emsp;createUser||integer(int64)||
|&emsp;&emsp;id||integer(int64)||
|&emsp;&emsp;idNumber||string||
|&emsp;&emsp;name||string||
|&emsp;&emsp;password||string||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;sex||string||
|&emsp;&emsp;status||integer(int32)||
|&emsp;&emsp;updateTime||string(date-time)||
|&emsp;&emsp;updateUser||integer(int64)||
|&emsp;&emsp;username||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"createTime": "",
		"createUser": 0,
		"id": 0,
		"idNumber": "",
		"name": "",
		"password": "",
		"phone": "",
		"sex": "",
		"status": 0,
		"updateTime": "",
		"updateUser": 0,
		"username": ""
	},
	"map": {},
	"msg": ""
}
```


## logOut


**接口地址**:`/employee/logout`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## page


**接口地址**:`/employee/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name|name|query|false|string||
|page|page|query|false|integer(int32)||
|pageSize|pageSize|query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«Page»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Page|Page|
|&emsp;&emsp;countId||string||
|&emsp;&emsp;current||integer(int64)||
|&emsp;&emsp;hitCount||boolean||
|&emsp;&emsp;maxLimit||integer(int64)||
|&emsp;&emsp;optimizeCountSql||boolean||
|&emsp;&emsp;orders||array|OrderItem|
|&emsp;&emsp;&emsp;&emsp;asc||boolean||
|&emsp;&emsp;&emsp;&emsp;column||string||
|&emsp;&emsp;pages||integer(int64)||
|&emsp;&emsp;records||array|object|
|&emsp;&emsp;searchCount||boolean||
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;total||integer(int64)||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"countId": "",
		"current": 0,
		"hitCount": true,
		"maxLimit": 0,
		"optimizeCountSql": true,
		"orders": [
			{
				"asc": true,
				"column": ""
			}
		],
		"pages": 0,
		"records": [],
		"searchCount": true,
		"size": 0,
		"total": 0
	},
	"map": {},
	"msg": ""
}
```


## getById


**接口地址**:`/employee/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«Employee»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Employee|Employee|
|&emsp;&emsp;createTime||string(date-time)||
|&emsp;&emsp;createUser||integer(int64)||
|&emsp;&emsp;id||integer(int64)||
|&emsp;&emsp;idNumber||string||
|&emsp;&emsp;name||string||
|&emsp;&emsp;password||string||
|&emsp;&emsp;phone||string||
|&emsp;&emsp;sex||string||
|&emsp;&emsp;status||integer(int32)||
|&emsp;&emsp;updateTime||string(date-time)||
|&emsp;&emsp;updateUser||integer(int64)||
|&emsp;&emsp;username||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"createTime": "",
		"createUser": 0,
		"id": 0,
		"idNumber": "",
		"name": "",
		"password": "",
		"phone": "",
		"sex": "",
		"status": 0,
		"updateTime": "",
		"updateUser": 0,
		"username": ""
	},
	"map": {},
	"msg": ""
}
```


# set-meal-controller


## save


**接口地址**:`/setmeal`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "categoryId": 0,
  "categoryName": "",
  "code": "",
  "createTime": "",
  "createUser": 0,
  "description": "",
  "id": 0,
  "image": "",
  "isDeleted": 0,
  "name": "",
  "price": 0,
  "setmealDishes": [
    {
      "copies": 0,
      "createTime": "",
      "createUser": 0,
      "dishId": 0,
      "id": 0,
      "isDeleted": 0,
      "name": "",
      "price": 0,
      "setmealId": 0,
      "sort": 0,
      "updateTime": "",
      "updateUser": 0
    }
  ],
  "status": 0,
  "updateTime": "",
  "updateUser": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|setmealDto|setmealDto|body|true|SetmealDto|SetmealDto|
|&emsp;&emsp;categoryId|||false|integer(int64)||
|&emsp;&emsp;categoryName|||false|string||
|&emsp;&emsp;code|||false|string||
|&emsp;&emsp;createTime|||false|string(date-time)||
|&emsp;&emsp;createUser|||false|integer(int64)||
|&emsp;&emsp;description|||false|string||
|&emsp;&emsp;id|||false|integer(int64)||
|&emsp;&emsp;image|||false|string||
|&emsp;&emsp;isDeleted|||false|integer(int32)||
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;price|||false|number||
|&emsp;&emsp;setmealDishes|||false|array|SetmealDish|
|&emsp;&emsp;&emsp;&emsp;copies|||false|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|||false|string||
|&emsp;&emsp;&emsp;&emsp;createUser|||false|integer||
|&emsp;&emsp;&emsp;&emsp;dishId|||false|integer||
|&emsp;&emsp;&emsp;&emsp;id|||false|integer||
|&emsp;&emsp;&emsp;&emsp;isDeleted|||false|integer||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;price|||false|number||
|&emsp;&emsp;&emsp;&emsp;setmealId|||false|integer||
|&emsp;&emsp;&emsp;&emsp;sort|||false|integer||
|&emsp;&emsp;&emsp;&emsp;updateTime|||false|string||
|&emsp;&emsp;&emsp;&emsp;updateUser|||false|integer||
|&emsp;&emsp;status|||false|integer(int32)||
|&emsp;&emsp;updateTime|||false|string(date-time)||
|&emsp;&emsp;updateUser|||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## delete


**接口地址**:`/setmeal`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|ids|ids|query|true|array|integer|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|204|No Content||
|401|Unauthorized||
|403|Forbidden||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```


## page


**接口地址**:`/setmeal/page`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name|name|query|false|string||
|page|page|query|false|integer(int32)||
|pageSize|pageSize|query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«Page»|
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||Page|Page|
|&emsp;&emsp;countId||string||
|&emsp;&emsp;current||integer(int64)||
|&emsp;&emsp;hitCount||boolean||
|&emsp;&emsp;maxLimit||integer(int64)||
|&emsp;&emsp;optimizeCountSql||boolean||
|&emsp;&emsp;orders||array|OrderItem|
|&emsp;&emsp;&emsp;&emsp;asc||boolean||
|&emsp;&emsp;&emsp;&emsp;column||string||
|&emsp;&emsp;pages||integer(int64)||
|&emsp;&emsp;records||array|object|
|&emsp;&emsp;searchCount||boolean||
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;total||integer(int64)||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": {
		"countId": "",
		"current": 0,
		"hitCount": true,
		"maxLimit": 0,
		"optimizeCountSql": true,
		"orders": [
			{
				"asc": true,
				"column": ""
			}
		],
		"pages": 0,
		"records": [],
		"searchCount": true,
		"size": 0,
		"total": 0
	},
	"map": {},
	"msg": ""
}
```


## updateStatus


**接口地址**:`/setmeal/status/{id}`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|id|path|true|integer(int32)||
|ids|ids|query|true|array|integer|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|R«string»|
|201|Created||
|401|Unauthorized||
|403|Forbidden||
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code||integer(int32)|integer(int32)|
|data||string||
|map||object||
|msg||string||


**响应示例**:
```javascript
{
	"code": 0,
	"data": "",
	"map": {},
	"msg": ""
}
```