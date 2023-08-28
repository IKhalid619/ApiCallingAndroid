package com.example.apicalling

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CutomListViewAdpater(val context: Context, val  data:List<DataModel>): BaseAdapter(){
    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return  data[position]
    }

    override fun getItemId(position: Int): Long {
        return data.size.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = LayoutInflater.from(context).inflate(R.layout.listviewdesign, parent, false)


        val name=   rowView.findViewById<TextView>(R.id.name)
        val roll=   rowView.findViewById<TextView>(R.id.roll)
        val age=   rowView.findViewById<TextView>(R.id.age)
        val email=   rowView.findViewById<TextView>(R.id.email)
        val course=   rowView.findViewById<TextView>(R.id.course)
        val mobile=   rowView.findViewById<TextView>(R.id.mobile)
        name.text=data[position].name
        roll.text=data[position].roll
        age.text=data[position].age
        email.text=data[position].email
        course.text=data[position].course
        mobile.text=data[position].mobile
        return  rowView


    }
}