package com.example.dreaming.ui.component

import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.dreaming.android.R

private val PretendardFamily = FontFamily(
    listOf(
        Font(
            resId = R.font.pretendard_regular,
            weight = FontWeight.Normal,
        ),
        Font(
            resId = R.font.pretendard_medium,
            weight = FontWeight.Medium,
        ),
        Font(
            resId = R.font.pretendard_semibold,
            weight = FontWeight.SemiBold,
        ),
    ),
)

private val platFormTextStyle = PlatformTextStyle(
    includeFontPadding = false,
)

object DreamingTypography {
    val Title4 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 48.sp,
        platformStyle = platFormTextStyle,
    )

    val Title3 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 42.sp,
        platformStyle = platFormTextStyle,
    )

    val Title2 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 36.sp,
        platformStyle = platFormTextStyle,
    )

    val Title1 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 32.sp,
        platformStyle = platFormTextStyle,
    )

    val HeadLine3 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 36.sp,
        platformStyle = platFormTextStyle,
    )

    val HeadLine2 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 32.sp,
        platformStyle = platFormTextStyle,
    )

    val HeadLine1 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.sp,
        platformStyle = platFormTextStyle,
    )

    val Body4 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 28.sp,
        platformStyle = platFormTextStyle,
    )

    val Body3 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp,
        platformStyle = platFormTextStyle,
    )

    val Body2 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 22.sp,
        platformStyle = platFormTextStyle,
    )

    val Body1 = TextStyle(
        fontFamily = PretendardFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp,
        platformStyle = platFormTextStyle,
    )


}
@Composable
fun Body1(
    text: String,
    modifier: Modifier = Modifier,
    fontWeight: FontWeight = FontWeight.Normal,
    lineHeight: Int = 24,
    letterSpacing: Int = 0,
    color: Color = Color.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {}
) {
    Typographyi(
        text = text,
        modifier = modifier,
        weight = fontWeight,
        size = 16,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = letterSpacing,
        baselineToTop = 20f,
        baselineToBottom = 4f,
        textDecoration = textDecoration,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout
    )
}

@Composable
fun Typographyi(
    text: String,
    modifier: Modifier = Modifier,
    weight: FontWeight,
    size: Int,
    color: Color,
    lineHeight: Int,
    letterSpacing: Int,
    baselineToTop: Float,
    baselineToBottom: Float,
    textDecoration: TextDecoration? = null,
    overflow: TextOverflow,
    softWrap: Boolean,
    maxLines: Int,
    onTextLayout: (TextLayoutResult) -> Unit
) {

    val baselineModifier =
        modifier.paddingFromBaseline(top = baselineToTop.sp, bottom = baselineToBottom.sp)
    Text(
        style = TextStyle(
            color = color,
            lineHeight = lineHeight.sp,
            letterSpacing = letterSpacing.sp,
            fontSize = size.sp,
            fontWeight = weight,
            textDecoration = textDecoration,
        ),
        text = text,
        modifier = baselineModifier,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout
    )
}