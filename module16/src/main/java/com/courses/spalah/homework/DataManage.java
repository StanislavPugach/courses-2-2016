package com.courses.spalah.homework;

/**
 * Created by Stanislav Pugach on 22.09.2016.
 */
public abstract class DataManage<N> {

    public abstract int save();

    public abstract N load(int id);
 }
