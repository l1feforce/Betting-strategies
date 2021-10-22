package org.gusev.nikita.bettingstrategies.extensions

import android.view.animation.Animation
import android.view.animation.BounceInterpolator
import android.view.animation.ScaleAnimation

fun scaleAnimation(): ScaleAnimation =
    ScaleAnimation(
        0.7f,
        1.0f,
        0.7f,
        1.0f,
        Animation.RELATIVE_TO_SELF,
        0.7f,
        Animation.RELATIVE_TO_SELF,
        0.7f
    ).apply {
        duration = 500
        interpolator = BounceInterpolator()
    }
