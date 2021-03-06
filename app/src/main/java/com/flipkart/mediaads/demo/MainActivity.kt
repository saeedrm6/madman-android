/*
 * Copyright (C) 2020 Flipkart Internet Pvt Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flipkart.mediaads.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.flipkart.mediaads.demo.ima.IMAPlayerActivity
import com.flipkart.mediaads.demo.madman.MadmanPlayerActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener { _ ->
            val intent: Intent = if (checkbox.isChecked) {
                Intent(this@MainActivity, MadmanPlayerActivity::class.java)
            } else {
                Intent(this@MainActivity, IMAPlayerActivity::class.java)
            }
            intent.putExtra("url", url.text)
            intent.putExtra("response", response.text)
            startActivity(intent)
        }
    }
}
