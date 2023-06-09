/*
 * Copyright (c) 2023 Kodeco LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package {{ cookiecutter.full_package_namespace }}.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val PrimaryColor = Color(0xFF006837)
val SecondaryColor = Color(0xFF004012)
val TertiaryColor = Color(0xFFc75f00)

private val LightColors = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = Color.White,
    primaryContainer = PrimaryColor,
    onPrimaryContainer = Color.White,
    inversePrimary = Color.White,

    secondary = SecondaryColor,
    onSecondary = Color.White,
    secondaryContainer = SecondaryColor,
    onSecondaryContainer = Color.White,

    tertiary = TertiaryColor,
    onTertiary = Color.White,
    tertiaryContainer = TertiaryColor,
    onTertiaryContainer = Color.White,

    surface = PrimaryColor,
    onSurface = Color.White,
    surfaceVariant = PrimaryColor,
    onSurfaceVariant = Color.White,
    surfaceTint = PrimaryColor,
    inverseSurface = Color.White,
    inverseOnSurface = PrimaryColor
)

private val DarkColors = darkColorScheme(
    primary = PrimaryColor,
    onPrimary = Color.White,
    primaryContainer = PrimaryColor,
    onPrimaryContainer = Color.White,
    inversePrimary = Color.White,

    secondary = SecondaryColor,
    onSecondary = Color.White,
    secondaryContainer = SecondaryColor,
    onSecondaryContainer = Color.White,

    tertiary = TertiaryColor,
    onTertiary = Color.White,
    tertiaryContainer = TertiaryColor,
    onTertiaryContainer = Color.White,

    surface = PrimaryColor,
    onSurface = Color.White,
    surfaceVariant = PrimaryColor,
    onSurfaceVariant = Color.White,
    surfaceTint = PrimaryColor,
    inverseSurface = Color.White,
    inverseOnSurface = PrimaryColor
)

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
  val colors = if (!useDarkTheme) {
    LightColors
  } else {
    DarkColors
  }

  MaterialTheme(
      colorScheme = colors,
      content = content
  )
}