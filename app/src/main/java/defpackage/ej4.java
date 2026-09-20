package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class ej4 {
    public final zv1 a;
    public final zv1 b;
    public final zv1 c;
    public final zv1 d;
    public final ia0 e;
    public final ia0 f;
    public final ia0 g;
    public final ia0 h;
    public final pq0 i;
    public final pq0 j;
    public final pq0 k;
    public final pq0 l;

    public ej4(QnHx qnHx) {
        this.a = qnHx.a;
        this.b = qnHx.b;
        this.c = qnHx.c;
        this.d = qnHx.d;
        this.e = qnHx.e;
        this.f = qnHx.f;
        this.g = qnHx.g;
        this.h = qnHx.h;
        this.i = qnHx.i;
        this.j = qnHx.j;
        this.k = qnHx.k;
        this.l = qnHx.l;
    }

    public static QnHx a(Context context, int i, int i2, F1 f1) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, Th.R);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            ia0 ia0VarC = c(typedArrayObtainStyledAttributes, 5, f1);
            ia0 ia0VarC2 = c(typedArrayObtainStyledAttributes, 8, ia0VarC);
            ia0 ia0VarC3 = c(typedArrayObtainStyledAttributes, 9, ia0VarC);
            ia0 ia0VarC4 = c(typedArrayObtainStyledAttributes, 7, ia0VarC);
            ia0 ia0VarC5 = c(typedArrayObtainStyledAttributes, 6, ia0VarC);
            QnHx qnHx = new QnHx();
            zv1 zv1VarO = C0239D.o(i4);
            qnHx.a = zv1VarO;
            float fB = QnHx.b(zv1VarO);
            if (fB != -1.0f) {
                qnHx.e = new F1(fB);
            }
            qnHx.e = ia0VarC2;
            zv1 zv1VarO2 = C0239D.o(i5);
            qnHx.b = zv1VarO2;
            float fB2 = QnHx.b(zv1VarO2);
            if (fB2 != -1.0f) {
                qnHx.f = new F1(fB2);
            }
            qnHx.f = ia0VarC3;
            zv1 zv1VarO3 = C0239D.o(i6);
            qnHx.c = zv1VarO3;
            float fB3 = QnHx.b(zv1VarO3);
            if (fB3 != -1.0f) {
                qnHx.g = new F1(fB3);
            }
            qnHx.g = ia0VarC4;
            zv1 zv1VarO4 = C0239D.o(i7);
            qnHx.d = zv1VarO4;
            float fB4 = QnHx.b(zv1VarO4);
            if (fB4 != -1.0f) {
                qnHx.h = new F1(fB4);
            }
            qnHx.h = ia0VarC5;
            return qnHx;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static QnHx b(Context context, AttributeSet attributeSet, int i, int i2) {
        F1 f1 = new F1(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.L, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, f1);
    }

    public static ia0 c(TypedArray typedArray, int i, ia0 ia0Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return ia0Var;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new F1(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new sl3(typedValuePeekValue.getFraction(1.0f, 1.0f)) : ia0Var;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(pq0.class) && this.j.getClass().equals(pq0.class) && this.i.getClass().equals(pq0.class) && this.k.getClass().equals(pq0.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof nu3) && (this.a instanceof nu3) && (this.c instanceof nu3) && (this.d instanceof nu3));
    }

    public static final class QnHx {
        public zv1 a;
        public zv1 b;
        public zv1 c;
        public zv1 d;
        public ia0 e;
        public ia0 f;
        public ia0 g;
        public ia0 h;
        public final pq0 i;
        public final pq0 j;
        public final pq0 k;
        public final pq0 l;

        public QnHx() {
            this.a = new nu3();
            this.b = new nu3();
            this.c = new nu3();
            this.d = new nu3();
            this.e = new F1(0.0f);
            this.f = new F1(0.0f);
            this.g = new F1(0.0f);
            this.h = new F1(0.0f);
            this.i = new pq0();
            this.j = new pq0();
            this.k = new pq0();
            this.l = new pq0();
        }

        public static float b(zv1 zv1Var) {
            if (zv1Var instanceof nu3) {
                return ((nu3) zv1Var).b;
            }
            if (zv1Var instanceof je0) {
                return ((je0) zv1Var).b;
            }
            return -1.0f;
        }

        public final ej4 a() {
            return new ej4(this);
        }

        public QnHx(ej4 ej4Var) {
            this.a = new nu3();
            this.b = new nu3();
            this.c = new nu3();
            this.d = new nu3();
            this.e = new F1(0.0f);
            this.f = new F1(0.0f);
            this.g = new F1(0.0f);
            this.h = new F1(0.0f);
            this.i = new pq0();
            this.j = new pq0();
            this.k = new pq0();
            this.l = new pq0();
            this.a = ej4Var.a;
            this.b = ej4Var.b;
            this.c = ej4Var.c;
            this.d = ej4Var.d;
            this.e = ej4Var.e;
            this.f = ej4Var.f;
            this.g = ej4Var.g;
            this.h = ej4Var.h;
            this.i = ej4Var.i;
            this.j = ej4Var.j;
            this.k = ej4Var.k;
            this.l = ej4Var.l;
        }
    }

    public ej4() {
        this.a = new nu3();
        this.b = new nu3();
        this.c = new nu3();
        this.d = new nu3();
        this.e = new F1(0.0f);
        this.f = new F1(0.0f);
        this.g = new F1(0.0f);
        this.h = new F1(0.0f);
        this.i = new pq0();
        this.j = new pq0();
        this.k = new pq0();
        this.l = new pq0();
    }
}
