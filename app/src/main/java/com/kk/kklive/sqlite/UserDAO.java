package com.kk.kklive.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * UserDAO配合DBHelper使用
 */

public class UserDAO {
    private SQLiteDatabase db;
    public UserDAO(Context context){
        DBHelper helper=new DBHelper(context);
        db=helper.getWritableDatabase();
    }

    //执行插入语句
    public long insert(String table, ContentValues values){
        // insert方法返回值 执行成功为新插入行的行号，执行失败返回-1
        return db.insert(table, null, values);
    }

    //修改数据
    public int updata(String table,ContentValues values,String whereClause, String[] whereArgs){

        // ContextValues，封装了字段修改后的值
        // whereClause，where语句，如果传null，修改所有行 where _id=?
        // whereArgs,替换where字句中的问号
        // 返回值为影响的行数
        return db.update(table, values, whereClause, whereArgs);
    }

    public int delete(String table, String whereClause, String[] whereArgs) {
        return db.delete(table, whereClause, whereArgs);
    }

    public Cursor select(String sql, String[] selectionArgs) {
        // Cursor,游标，相当于结果集（ResultSet）
        Cursor cursor = db.rawQuery(sql, selectionArgs);

        return cursor;
    }

    public Cursor findAll(String table, String[] columns, String selection, String[] selectionArgs, String groupBy,
                          String having, String orderBy) {
        // distinct,true,去掉重复性
        // table,表名
        // columns,字符串数组，指定查询的字段名,如果传null返回所有的字段
        // selection,where字句
        // selectionArgs,替换where字句中的占位符
        // groupBy,分组
        // having,分组之后再过滤
        // orderBy ,排序
        Cursor cursor = db.query(table, columns, selection, selectionArgs, groupBy, having, orderBy);
        return cursor;
    }

}
