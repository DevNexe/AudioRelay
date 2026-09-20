package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.LPt8Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class pr0 implements TransformationMethod {
    public final TransformationMethod w;

    public pr0(TransformationMethod transformationMethod) {
        this.w = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.w;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || LPt8Fixed.a().b() != 1) {
            return charSequence;
        }
        LPt8Fixed lPt8A = LPt8Fixed.a();
        lPt8A.getClass();
        return lPt8A.f(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.w;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
