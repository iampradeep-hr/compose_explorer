package com.pradeep.composeexplorer.ui_components

import android.widget.CheckBox
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pradeep.composeexplorer.ui.theme.Purple200
import com.pradeep.composeexplorer.ui.theme.Purple40
import com.pradeep.composeexplorer.ui.theme.Purple700
import com.pradeep.composeexplorer.ui.theme.Purple80

@Composable
fun CheckBoxTut() {
    var checked by remember {
        mutableStateOf(false)
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
//        Checkbox(checked = checked, onCheckedChange = {
//            checked=!checked
//        })

        CustomCheckBox(selected = checked, onValueChange ={
            checked=!checked
        } )
    }
}

//custom
@Composable
fun CustomCheckBox(
    modifier:Modifier=Modifier,
    selected:Boolean,
    onValueChange:(Boolean)->Unit
) {
    Box(
        modifier = modifier
            .background(
                if (selected) Purple200 else Color.Transparent,
                shape = RoundedCornerShape(8.dp)
            )
            .border(BorderStroke(2.dp, Purple700), shape = RoundedCornerShape(8.dp))
            .size(30.dp)
            .clickable { onValueChange(!selected) },

        contentAlignment = Alignment.Center
    ) {
        if (selected) Icon(
            imageVector = Icons.Default.Check,
            contentDescription = null,
            tint = Color.White
        )
    }

}