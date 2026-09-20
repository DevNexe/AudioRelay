package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.QnHx qnHx = (ConstraintLayout.QnHx) getLayoutParams();
        qnHx.a = i;
        setLayoutParams(qnHx);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.QnHx qnHx = (ConstraintLayout.QnHx) getLayoutParams();
        qnHx.b = i;
        setLayoutParams(qnHx);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.QnHx qnHx = (ConstraintLayout.QnHx) getLayoutParams();
        qnHx.c = f;
        setLayoutParams(qnHx);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
