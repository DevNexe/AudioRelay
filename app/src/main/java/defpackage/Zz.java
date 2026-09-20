package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class Zz {
    public final TextView a;
    public final nr0 b;

    public Zz(TextView textView) {
        this.a = textView;
        this.b = new nr0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a.a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, xApe.D, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        this.b.a.c(z);
    }

    public final void d(boolean z) {
        this.b.a.d(z);
    }
}
