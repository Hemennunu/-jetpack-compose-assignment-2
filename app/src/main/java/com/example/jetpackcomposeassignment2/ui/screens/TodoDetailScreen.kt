package com.example.jetpackcomposeassignment2.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeassignment2.model.Todo
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoDetailScreen(todo: Todo, onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Todo Detail", color = Color(0xFF6A1B9A)) // Custom purple title
                },
                navigationIcon = {
                    IconButton(onClick = { onBack() }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color(0xFF00897B) // Teal icon
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFF3E5F5) // Light purple background
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("ID: ${todo.id}", color = Color(0xFF4A148C), style = MaterialTheme.typography.titleLarge)
            Text("User ID: ${todo.userId}", color = Color(0xFF00695C), style = MaterialTheme.typography.bodyLarge)
            Text("Title: ${todo.title}", color = Color(0xFFAD1457), style = MaterialTheme.typography.bodyLarge)
            Text(
                "Status: ${if (todo.completed) "Completed" else "Incomplete"}",
                color = if (todo.completed) Color(0xFF2E7D32) else Color(0xFFD32F2F),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}
