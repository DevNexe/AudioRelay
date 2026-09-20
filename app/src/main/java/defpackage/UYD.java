package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class UYD extends os4 implements c85 {
    public CQf L;
    public YKK M;
    public int N;
    public int O;
    public boolean P;

    public static class CQf extends os4.QnHx {
        public q62<Long> I;
        public wq4<Integer> J;

        public CQf(CQf cQf, UYD uyd, Resources resources) {
            super(cQf, uyd, resources);
            if (cQf != null) {
                this.I = cQf.I;
                this.J = cQf.J;
            } else {
                this.I = new q62<>();
                this.J = new wq4<>();
            }
        }

        @Override // os4.QnHx, xo0.F1
        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        @Override // os4.QnHx, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new UYD(this, null);
        }

        @Override // os4.QnHx, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new UYD(this, resources);
        }
    }

    public static class F1 extends YKK {
        public final mV a;

        public F1(mV mVVar) {
            this.a = mVVar;
        }

        @Override // UYD.YKK
        public final void c() {
            this.a.start();
        }

        @Override // UYD.YKK
        public final void d() {
            this.a.stop();
        }
    }

    public static class LPt8Fixed extends YKK {
        public final ObjectAnimator a;
        public final boolean b;

        public LPt8Fixed(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            NUlFixed nUl = new NUlFixed(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            nw.a(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(nUl.c);
            objectAnimatorOfInt.setInterpolator(nUl);
            this.b = z2;
            this.a = objectAnimatorOfInt;
        }

        @Override // UYD.YKK
        public final boolean a() {
            return this.b;
        }

        @Override // UYD.YKK
        public final void b() {
            this.a.reverse();
        }

        @Override // UYD.YKK
        public final void c() {
            this.a.start();
        }

        @Override // UYD.YKK
        public final void d() {
            this.a.cancel();
        }
    }

    public static class NUlFixed implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public NUlFixed(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
        }
    }

    public static class QnHx extends YKK {
        public final Animatable a;

        public QnHx(Animatable animatable) {
            this.a = animatable;
        }

        @Override // UYD.YKK
        public final void c() {
            this.a.start();
        }

        @Override // UYD.YKK
        public final void d() {
            this.a.stop();
        }
    }

    public static abstract class YKK {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public UYD() {
        this(null, null);
    }

    public static UYD g(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int depth;
        Context context2;
        Drawable drawableF;
        int next;
        int next2;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        UYD uyd = new UYD();
        TypedArray typedArrayI = zb5.i(resources2, theme2, attributeSet, fTO$.x);
        int i = 1;
        uyd.setVisible(typedArrayI.getBoolean(1, true), true);
        CQf cQf = uyd.L;
        cQf.d |= ow.b(typedArrayI);
        int i2 = 2;
        cQf.i = typedArrayI.getBoolean(2, cQf.i);
        int i3 = 3;
        cQf.l = typedArrayI.getBoolean(3, cQf.l);
        cQf.y = typedArrayI.getInt(4, cQf.y);
        cQf.z = typedArrayI.getInt(5, cQf.z);
        boolean z = false;
        uyd.setDither(typedArrayI.getBoolean(0, cQf.w));
        xo0.F1 f1 = uyd.w;
        if (resources2 != null) {
            f1.b = resources2;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = f1.c;
            f1.c = i4;
            if (i5 != i4) {
                f1.m = false;
                f1.j = false;
            }
        } else {
            f1.getClass();
        }
        typedArrayI.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        Context context3 = context;
        Resources.Theme theme3 = theme2;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                break;
            }
            if (next3 == i2 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayI2 = zb5.i(resources2, theme3, attributeSet, fTO$.y);
                    int resourceId = typedArrayI2.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId2 = typedArrayI2.getResourceId(i, -1);
                    drawableF = resourceId2 > 0 ? qp3.d().f(context3, resourceId2) : null;
                    typedArrayI2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i6 = 0;
                    for (int i7 = 0; i7 < attributeCount; i7++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i8 = i6 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i7, z)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i6] = attributeNameResource;
                            i6 = i8;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i6);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new og5();
                            drawableF.inflate(resources2, xmlResourceParser, attributeSet, theme3);
                        } else {
                            drawableF = ow.a(resources2, xmlResourceParser, attributeSet, theme3);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    CQf cQf2 = uyd.L;
                    int iA = cQf2.a(drawableF);
                    cQf2.H[iA] = iArrTrimStateSet;
                    cQf2.J.j(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayI3 = zb5.i(resources2, theme3, attributeSet, fTO$.z);
                        int resourceId3 = typedArrayI3.getResourceId(2, -1);
                        int resourceId4 = typedArrayI3.getResourceId(1, -1);
                        int resourceId5 = typedArrayI3.getResourceId(z ? 1 : 0, -1);
                        drawableF = resourceId5 > 0 ? qp3.d().f(context3, resourceId5) : null;
                        boolean z2 = typedArrayI3.getBoolean(3, z);
                        typedArrayI3.recycle();
                        if (drawableF == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                context2 = context;
                                drawableF = new mV(context2);
                                drawableF.inflate(resources2, xmlResourceParser, attributeSet, theme2);
                            } else {
                                context2 = context;
                                drawableF = ow.a(resources2, xmlResourceParser, attributeSet, theme3);
                            }
                        } else {
                            context2 = context;
                        }
                        if (drawableF == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        CQf cQf3 = uyd.L;
                        int iA2 = cQf3.a(drawableF);
                        long j = resourceId3;
                        long j2 = resourceId4;
                        long j3 = j2 | (j << 32);
                        long j4 = z2 ? 8589934592L : 0L;
                        long j5 = iA2;
                        cQf3.I.a(j3, Long.valueOf(j5 | j4));
                        if (z2) {
                            cQf3.I.a((j2 << 32) | j, Long.valueOf(j5 | 4294967296L | j4));
                        }
                    } else {
                        context2 = context;
                    }
                    theme3 = theme;
                    context3 = context2;
                }
                theme2 = theme;
                resources2 = resources;
                i = 1;
                z = false;
                i2 = 2;
                i3 = 3;
            }
        }
        uyd.onStateChange(uyd.getState());
        return uyd;
    }

    @Override // defpackage.os4, defpackage.xo0
    public final xo0.F1 b() {
        return new CQf(this.L, this, null);
    }

    @Override // defpackage.os4, defpackage.xo0
    public final void e(xo0.F1 f1) {
        super.e(f1);
        if (f1 instanceof CQf) {
            this.L = (CQf) f1;
        }
    }

    @Override // defpackage.os4
    /* JADX INFO: renamed from: f */
    public final os4.QnHx b() {
        return new CQf(this.L, this, null);
    }

    @Override // defpackage.xo0, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        YKK ykk = this.M;
        if (ykk != null) {
            ykk.d();
            this.M = null;
            d(this.N);
            this.N = -1;
            this.O = -1;
        }
    }

    @Override // defpackage.os4, defpackage.xo0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.P) {
            super.mutate();
            this.L.e();
            this.P = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    @Override // defpackage.os4, defpackage.xo0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        CQf cQf;
        int iIntValue;
        int iIntValue2;
        boolean z;
        long j;
        int iLongValue;
        boolean z2;
        Object obj;
        YKK qnHx;
        boolean z3;
        CQf cQf2 = this.L;
        int iF = cQf2.f(iArr);
        if (iF < 0) {
            iF = cQf2.f(StateSet.WILD_CARD);
        }
        int i = this.C;
        boolean z4 = false;
        if (iF != i) {
            YKK ykk = this.M;
            if (ykk == null) {
                this.M = null;
                this.O = -1;
                this.N = -1;
                cQf = this.L;
                if (i < 0) {
                    cQf.getClass();
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) cQf.J.i(i, 0)).intValue();
                }
                if (iF < 0) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = ((Integer) cQf.J.i(iF, 0)).intValue();
                }
                if (iIntValue2 != 0 && iIntValue != 0) {
                    j = ((long) iIntValue2) | (((long) iIntValue) << 32);
                    iLongValue = (int) ((Long) cQf.I.i(j, -1L)).longValue();
                    if (iLongValue >= 0) {
                        if ((((Long) cQf.I.i(j, -1L)).longValue() & 8589934592L) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        d(iLongValue);
                        obj = this.y;
                        if (obj instanceof AnimationDrawable) {
                            if ((((Long) cQf.I.i(j, -1L)).longValue() & 4294967296L) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            qnHx = new LPt8Fixed((AnimationDrawable) obj, z3, z2);
                        } else if (obj instanceof mV) {
                            qnHx = new F1((mV) obj);
                        } else if (obj instanceof Animatable) {
                            qnHx = new QnHx((Animatable) obj);
                        }
                        qnHx.c();
                        this.M = qnHx;
                        this.O = i;
                        this.N = iF;
                        z = true;
                    }
                }
                z = false;
            } else {
                if (iF != this.N) {
                    if (iF == this.O && ykk.a()) {
                        ykk.b();
                        this.N = this.O;
                        this.O = iF;
                    } else {
                        i = this.N;
                        ykk.d();
                        this.M = null;
                        this.O = -1;
                        this.N = -1;
                        cQf = this.L;
                        if (i < 0) {
                            cQf.getClass();
                            iIntValue = 0;
                        } else {
                            iIntValue = ((Integer) cQf.J.i(i, 0)).intValue();
                        }
                        if (iF < 0) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = ((Integer) cQf.J.i(iF, 0)).intValue();
                        }
                        if (iIntValue2 != 0) {
                            j = ((long) iIntValue2) | (((long) iIntValue) << 32);
                            iLongValue = (int) ((Long) cQf.I.i(j, -1L)).longValue();
                            if (iLongValue >= 0) {
                                if ((((Long) cQf.I.i(j, -1L)).longValue() & 8589934592L) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                d(iLongValue);
                                obj = this.y;
                                if (obj instanceof AnimationDrawable) {
                                    if ((((Long) cQf.I.i(j, -1L)).longValue() & 4294967296L) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    qnHx = new LPt8Fixed((AnimationDrawable) obj, z3, z2);
                                } else if (obj instanceof mV) {
                                    qnHx = new F1((mV) obj);
                                } else if (obj instanceof Animatable) {
                                    qnHx = new QnHx((Animatable) obj);
                                }
                                qnHx.c();
                                this.M = qnHx;
                                this.O = i;
                                this.N = iF;
                            }
                        }
                        z = false;
                    }
                }
                z = true;
            }
            if (z || d(iF)) {
                z4 = true;
            }
        }
        Drawable drawable = this.y;
        return drawable != null ? z4 | drawable.setState(iArr) : z4;
    }

    @Override // defpackage.xo0, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        YKK ykk = this.M;
        if (ykk != null && (visible || z2)) {
            if (z) {
                ykk.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public UYD(CQf cQf, Resources resources) {
        this.N = -1;
        this.O = -1;
        e(new CQf(cQf, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
