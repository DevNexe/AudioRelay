package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class g85 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public g85(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static g85 l(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new g85(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final ColorStateList b(int i) {
        int resourceId;
        ColorStateList colorStateListK;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListK = XTd3.k(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListK;
    }

    public final int c(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final Drawable e(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : XTd3.l(this.a, resourceId);
    }

    public final Typeface f(int i, int i2, YUjp.QnHx qnHx) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = sp3.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return sp3.a(context, resourceId, typedValue, i2, qnHx, true, false);
    }

    public final int g(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final int h(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final String i(int i) {
        return this.b.getString(i);
    }

    public final CharSequence j(int i) {
        return this.b.getText(i);
    }

    public final boolean k(int i) {
        return this.b.hasValue(i);
    }

    public final void m() {
        this.b.recycle();
    }
}
