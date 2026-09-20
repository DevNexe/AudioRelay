package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ye0 {

    public static class QnHx extends ViewGroup.MarginLayoutParams {
        public int a;

        public QnHx(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xApe.y);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public QnHx() {
            super(-2, -2);
            this.a = 8388627;
        }

        public QnHx(QnHx qnHx) {
            super((ViewGroup.MarginLayoutParams) qnHx);
            this.a = 0;
            this.a = qnHx.a;
        }

        public QnHx(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
