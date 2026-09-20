package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: loaded from: classes3.dex */
public interface yq {

    public static class CQf extends Property<yq, LPt8Fixed> {
        public static final CQf a = new CQf();

        public CQf() {
            super(LPt8Fixed.class, "circularReveal");
        }

        @Override // android.util.Property
        public final LPt8Fixed get(yq yqVar) {
            return yqVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(yq yqVar, LPt8Fixed lPt8) {
            yqVar.setRevealInfo(lPt8);
        }
    }

    public static class F1 extends Property<yq, Integer> {
        public static final F1 a = new F1();

        public F1() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(yq yqVar) {
            return Integer.valueOf(yqVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(yq yqVar, Integer num) {
            yqVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class LPt8Fixed {
        public float a;
        public float b;
        public float c;

        public LPt8Fixed() {
        }

        public LPt8Fixed(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    public static class QnHx implements TypeEvaluator<LPt8Fixed> {
        public static final QnHx b = new QnHx();
        public final LPt8Fixed a = new LPt8Fixed();

        @Override // android.animation.TypeEvaluator
        public final LPt8Fixed evaluate(float f, LPt8Fixed lPt8, LPt8Fixed lPt9) {
            LPt8Fixed lPt10 = lPt8;
            LPt8Fixed lPt11 = lPt9;
            float f2 = lPt10.a;
            float f3 = 1.0f - f;
            float f4 = (lPt11.a * f) + (f2 * f3);
            float f5 = lPt10.b;
            float f6 = (lPt11.b * f) + (f5 * f3);
            float f7 = lPt10.c;
            float f8 = (f * lPt11.c) + (f3 * f7);
            LPt8Fixed lPt12 = this.a;
            lPt12.a = f4;
            lPt12.b = f6;
            lPt12.c = f8;
            return lPt12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    LPt8Fixed getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(LPt8Fixed lPt8);
}
