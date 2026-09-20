package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class ja2 {
    public static ColorStateList a(Context context, g85 g85Var, int i) {
        int iH;
        ColorStateList colorStateListK;
        return (!g85Var.k(i) || (iH = g85Var.h(i, 0)) == 0 || (colorStateListK = XTd3.k(context, iH)) == null) ? g85Var.b(i) : colorStateListK;
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListK;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListK = XTd3.k(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListK;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableL;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableL = XTd3.l(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableL;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
