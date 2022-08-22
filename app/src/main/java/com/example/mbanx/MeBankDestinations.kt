package com.example.mbanx

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.MoneyOff
import androidx.compose.material.icons.filled.PieChart
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink

/**
 * Contract for information needed on every MeBank navigation destination
 */

interface MeBankDestination {
    val icon: ImageVector
    val route: String
}

/**
 * Rally app navigation destinations
 */
object Overview : MeBankDestination {
    override val icon = Icons.Filled.PieChart
    override val route = "overview"
}

object Accounts : MeBankDestination {
    override val icon = Icons.Filled.AttachMoney
    override val route = "accounts"
}

object Bills : MeBankDestination {
    override val icon = Icons.Filled.MoneyOff
    override val route = "bills"
}

object SingleAccount : MeBankDestination {
    // Added for simplicity, this icon will not in fact be used, as SingleAccount isn't
    // part of the MeBankTabRow selection
    override val icon = Icons.Filled.Money
    override val route = "single_account"
    const val accountTypeArg = "account_type"
    val routeWithArgs = "$route/{$accountTypeArg}"
    val arguments = listOf(
        navArgument(accountTypeArg) { type = NavType.StringType }
    )
    val deepLinks = listOf(
        navDeepLink { uriPattern = "rally://$route/{$accountTypeArg}" }
    )
}

// Screens to be displayed in the top RallyTabRow
val meBankTabRowScreens = listOf(Overview, Accounts, Bills)
