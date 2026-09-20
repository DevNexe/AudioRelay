package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.azefsw.audioconnect.R;
import defpackage.Th;
import defpackage.bi5;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {
    public final RectF A;
    public final int B;
    public float C;
    public boolean D;
    public double E;
    public int F;
    public final ArrayList w;
    public final int x;
    public final float y;
    public final Paint z;

    public interface QnHx {
        void a(float f);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.w = new ArrayList();
        Paint paint = new Paint();
        this.z = paint;
        this.A = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.C, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.y = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = bi5.a;
        bi5.LPt8Fixed.s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(float f) {
        b(f, false);
    }

    public final void b(float f, boolean z) {
        float f2 = f % 360.0f;
        this.C = f2;
        this.E = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.F * ((float) Math.cos(this.E))) + (getWidth() / 2);
        float fSin = (this.F * ((float) Math.sin(this.E))) + height;
        float f3 = this.x;
        this.A.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((QnHx) it.next()).a(f2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fCos = (this.F * ((float) Math.cos(this.E))) + f;
        float f2 = height;
        float fSin = (this.F * ((float) Math.sin(this.E))) + f2;
        Paint paint = this.z;
        paint.setStrokeWidth(0.0f);
        int i = this.x;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.E);
        double dCos = Math.cos(this.E);
        double d = this.F - i;
        paint.setStrokeWidth(this.B);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.y, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(this.C);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked != 0) {
            z = (actionMasked == 1 || actionMasked == 2) ? this.D : false;
            z2 = false;
        } else {
            this.D = false;
            z = false;
            z2 = true;
        }
        boolean z4 = this.D;
        int degrees = ((int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = degrees;
        boolean z5 = this.C != f;
        if (z2 && z5) {
            z3 = true;
        } else if (z5 || z) {
            a(f);
            z3 = true;
        }
        this.D = z4 | z3;
        return true;
    }
}
