package defpackage;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cn4 {
    public static final float a = 10;
    public static final float b = 24;
    public static final float c = 1;
    public static final float d = 6;
    public static final float e = 4;
    public static final pg2 f;
    public static final nb5<Float> g;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ rt<Float> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ h81<sd5> C;
        public final /* synthetic */ ci2 D;
        public final /* synthetic */ sm4 E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;
        public final /* synthetic */ float w;
        public final /* synthetic */ j81<Float, sd5> x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(float f, j81<? super Float, sd5> j81Var, pg2 pg2Var, boolean z, rt<Float> rtVar, int i, h81<sd5> h81Var, ci2 ci2Var, sm4 sm4Var, int i2, int i3) {
            super(2);
            this.w = f;
            this.x = j81Var;
            this.y = pg2Var;
            this.z = z;
            this.A = rtVar;
            this.B = i;
            this.C = h81Var;
            this.D = ci2Var;
            this.E = sm4Var;
            this.F = i2;
            this.G = i3;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            cn4.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, g30Var, this.F | 1, this.G);
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.material.SliderKt$SliderThumb$1$1$1", f = "Slider.kt", l = {682}, m = "invokeSuspend")
    public static final class F1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ ci2 B;
        public final /* synthetic */ wp4<vp1> C;

        public static final class QnHx implements nz0<vp1> {
            public final /* synthetic */ wp4<vp1> w;

            public QnHx(wp4<vp1> wp4Var) {
                this.w = wp4Var;
            }

            @Override // defpackage.nz0
            public final Object f(vp1 vp1Var, z80 z80Var) {
                vp1 vp1Var2 = vp1Var;
                boolean z = vp1Var2 instanceof qd3;
                wp4<vp1> wp4Var = this.w;
                if (z) {
                    wp4Var.add(vp1Var2);
                } else if (vp1Var2 instanceof rd3) {
                    wp4Var.remove(((rd3) vp1Var2).a);
                } else if (vp1Var2 instanceof pd3) {
                    wp4Var.remove(((pd3) vp1Var2).a);
                } else if (vp1Var2 instanceof nn0) {
                    wp4Var.add(vp1Var2);
                } else if (vp1Var2 instanceof on0) {
                    wp4Var.remove(((on0) vp1Var2).a);
                } else if (vp1Var2 instanceof mn0) {
                    wp4Var.remove(((mn0) vp1Var2).a);
                }
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(ci2 ci2Var, wp4<vp1> wp4Var, z80<? super F1> z80Var) {
            super(2, z80Var);
            this.B = ci2Var;
            this.C = wp4Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new F1(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                nj4 nj4VarA = this.B.a();
                QnHx qnHx = new QnHx(this.C);
                this.A = 1;
                nj4VarA.getClass();
                if (nj4.n(nj4VarA, qnHx, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((F1) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ sm4 A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ float C;
        public final /* synthetic */ int D;
        public final /* synthetic */ ke w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ float y;
        public final /* synthetic */ ci2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(ke keVar, pg2 pg2Var, float f, ci2 ci2Var, sm4 sm4Var, boolean z, float f2, int i) {
            super(2);
            this.w = keVar;
            this.x = pg2Var;
            this.y = f;
            this.z = ci2Var;
            this.A = sm4Var;
            this.B = z;
            this.C = f2;
            this.D = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            cn4.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements j81<ro0, sd5> {
        public final /* synthetic */ float A;
        public final /* synthetic */ is4<yu> B;
        public final /* synthetic */ List<Float> C;
        public final /* synthetic */ is4<yu> D;
        public final /* synthetic */ is4<yu> E;
        public final /* synthetic */ float w;
        public final /* synthetic */ is4<yu> x;
        public final /* synthetic */ float y;
        public final /* synthetic */ float z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(float f, is4<yu> is4Var, float f2, float f3, float f4, is4<yu> is4Var2, List<Float> list, is4<yu> is4Var3, is4<yu> is4Var4) {
            super(1);
            this.w = f;
            this.x = is4Var;
            this.y = f2;
            this.z = f3;
            this.A = f4;
            this.B = is4Var2;
            this.C = list;
            this.D = is4Var3;
            this.E = is4Var4;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ro0 ro0Var) {
            ro0 ro0Var2 = ro0Var;
            boolean z = ro0Var2.getLayoutDirection() == jy1.Rtl;
            float fD = kt2.d(ro0Var2.t0());
            float f = this.w;
            long jA = X.a(f, fD);
            long jA2 = X.a(cm4.e(ro0Var2.d()) - f, kt2.d(ro0Var2.t0()));
            long j = z ? jA2 : jA;
            long j2 = z ? jA : jA2;
            long j3 = j2;
            ro0Var2.E(this.x.getValue().a, j, j2, (496 & 8) != 0 ? 0.0f : this.y, (496 & 16) != 0 ? 0 : 1, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, (496 & 256) != 0 ? 3 : 0);
            float fC = kt2.c(j);
            float fC2 = kt2.c(j3) - kt2.c(j);
            float f2 = this.z;
            long jA3 = X.a((fC2 * f2) + fC, kt2.d(ro0Var2.t0()));
            float fC3 = kt2.c(j);
            float fC4 = kt2.c(j3) - kt2.c(j);
            float f3 = this.A;
            ro0Var2.E(this.B.getValue().a, X.a((fC4 * f3) + fC3, kt2.d(ro0Var2.t0())), jA3, (496 & 8) != 0 ? 0.0f : this.y, (496 & 16) != 0 ? 0 : 1, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, (496 & 256) != 0 ? 3 : 0);
            List<Float> list = this.C;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                float fFloatValue = ((Number) obj).floatValue();
                Boolean boolValueOf = Boolean.valueOf(fFloatValue > f2 || fFloatValue < f3);
                Object arrayList = linkedHashMap.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(boolValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            float f4 = this.y;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                List list2 = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList(mu.w0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new kt2(X.a(kt2.c(X.y(j, j3, ((Number) it.next()).floatValue())), kt2.d(ro0Var2.t0()))));
                }
                long j4 = j3;
                ro0Var2.y0(arrayList2, (zBooleanValue ? this.D : this.E).getValue().a, f4, 1, null, 1.0f, null, 3);
                j3 = j4;
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<se, g30, Integer, sd5> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ List<Float> B;
        public final /* synthetic */ sm4 C;
        public final /* synthetic */ is4<j81<Float, sd5>> D;
        public final /* synthetic */ h81<sd5> E;
        public final /* synthetic */ rt<Float> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ float y;
        public final /* synthetic */ ci2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(rt rtVar, int i, float f, ci2 ci2Var, boolean z, List list, sm4 sm4Var, ri2 ri2Var, h81 h81Var) {
            super(3);
            this.w = rtVar;
            this.x = i;
            this.y = f;
            this.z = ci2Var;
            this.A = z;
            this.B = list;
            this.C = sm4Var;
            this.D = ri2Var;
            this.E = h81Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final float a(float f, gl3 gl3Var, gl3 gl3Var2, rt rtVar) {
            float fFloatValue = ((Number) rtVar.b()).floatValue();
            float fFloatValue2 = ((Number) rtVar.e()).floatValue();
            float f2 = gl3Var.w;
            float f3 = gl3Var2.w;
            float f4 = cn4.a;
            float f5 = fFloatValue2 - fFloatValue;
            return C0239D.y(f2, f3, AY.n((f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f - fFloatValue) / f5, 0.0f, 1.0f));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.y81
        public final sd5 invoke(se seVar, g30 g30Var, Integer num) {
            se seVar2 = seVar;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(seVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                boolean z = g30Var2.E(r40.k) == jy1.Rtl;
                float fH = g70.h(seVar2.a());
                gl3 gl3Var = new gl3();
                gl3 gl3Var2 = new gl3();
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                float f = cn4.a;
                gl3Var.w = Math.max(fH - ij0Var.b0(f), 0.0f);
                gl3Var2.w = Math.min(ij0Var.b0(f), gl3Var.w);
                g30Var2.e(773894976);
                g30Var2.e(-492369756);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (objF == c0132QnHx) {
                    s40 s40Var = new s40(wq0.i(g30Var2));
                    g30Var2.B(s40Var);
                    objF = s40Var;
                }
                g30Var2.G();
                ua0 ua0Var = ((s40) objF).w;
                g30Var2.G();
                g30Var2.e(-492369756);
                Object objF2 = g30Var2.f();
                float f2 = this.y;
                rt<Float> rtVar = this.w;
                if (objF2 == c0132QnHx) {
                    objF2 = ps0.R(Float.valueOf(a(f2, gl3Var2, gl3Var, rtVar)));
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                ri2 ri2Var = (ri2) objF2;
                g30Var2.e(-492369756);
                Object objF3 = g30Var2.f();
                if (objF3 == c0132QnHx) {
                    objF3 = ps0.R(Float.valueOf(0.0f));
                    g30Var2.B(objF3);
                }
                g30Var2.G();
                ri2 ri2Var2 = (ri2) objF3;
                Float fValueOf = Float.valueOf(gl3Var2.w);
                Float fValueOf2 = Float.valueOf(gl3Var.w);
                rt<Float> rtVar2 = this.w;
                is4<j81<Float, sd5>> is4Var = this.D;
                g30Var2.e(1618982084);
                boolean zI = g30Var2.I(fValueOf) | g30Var2.I(fValueOf2) | g30Var2.I(rtVar2);
                Object objF4 = g30Var2.f();
                if (zI || objF4 == c0132QnHx) {
                    tm4 tm4Var = new tm4(new zm4(ri2Var, ri2Var2, gl3Var2, gl3Var, is4Var, rtVar2));
                    g30Var2.B(tm4Var);
                    objF4 = tm4Var;
                }
                g30Var2.G();
                tm4 tm4Var2 = (tm4) objF4;
                rt<Float> rtVar3 = this.w;
                xm4 xm4Var = new xm4(rtVar3, gl3Var2, gl3Var);
                pt ptVar = new pt(gl3Var2.w, gl3Var.w);
                float f3 = this.y;
                int i = this.x;
                int i2 = i >> 9;
                cn4.d(xm4Var, rtVar3, ptVar, ri2Var, f3, g30Var2, (i2 & 112) | 3072 | ((i << 12) & 57344));
                ri2 ri2VarF0 = ps0.f0(new bn4(ri2Var, this.B, gl3Var2, gl3Var, ua0Var, tm4Var2, this.E), g30Var2);
                c30 c30Var = new c30(wo1.a, new jn4(fH, tm4Var2, this.z, ri2Var2, ri2Var, ri2VarF0, this.A, z));
                aw2 aw2Var = aw2.Horizontal;
                boolean zBooleanValue = ((Boolean) tm4Var2.b.getValue()).booleanValue();
                boolean z2 = this.A;
                ci2 ci2Var = this.z;
                g30Var2.e(1157296644);
                boolean zI2 = g30Var2.I(ri2VarF0);
                Object objF5 = g30Var2.f();
                if (zI2 || objF5 == c0132QnHx) {
                    objF5 = new ym4(ri2VarF0, null);
                    g30Var2.B(objF5);
                }
                g30Var2.G();
                pg2 pg2VarD = do0.d(tm4Var2, aw2Var, z2, ci2Var, zBooleanValue, (y81) objF5, z);
                float fN = AY.n(f2, rtVar.b().floatValue(), rtVar.e().floatValue());
                float fFloatValue = rtVar.b().floatValue();
                float fFloatValue2 = rtVar.e().floatValue() - fFloatValue;
                cn4.e(this.A, AY.n((fFloatValue2 > 0.0f ? 1 : (fFloatValue2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (fN - fFloatValue) / fFloatValue2, 0.0f, 1.0f), this.B, this.C, gl3Var.w - gl3Var2.w, this.z, c30Var.y(pg2VarD), g30Var2, ((i >> 6) & 458752) | (i2 & 14) | AdRequest.MAX_CONTENT_URL_LENGTH | ((i >> 15) & 7168));
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ float A;
        public final /* synthetic */ List<Float> B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ int E;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ sm4 x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ float z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(pg2 pg2Var, sm4 sm4Var, boolean z, float f, float f2, List<Float> list, float f3, float f4, int i) {
            super(2);
            this.w = pg2Var;
            this.x = sm4Var;
            this.y = z;
            this.z = f;
            this.A = f2;
            this.B = list;
            this.C = f3;
            this.D = f4;
            this.E = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            cn4.c(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, g30Var, this.E | 1);
            return sd5.a;
        }
    }

    static {
        wo1.QnHx qnHx = wo1.a;
        f = hj0.b(new lm4(144, 0.0f, Float.NaN, 0.0f, 10), new lm4(0.0f, Float.NaN, 0.0f, 48, 5));
        g = new nb5<>(100, (mq0) null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x013f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0165  */
    /* JADX WARN: Code duplicated, block: B:121:0x0169  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x017e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x0187  */
    /* JADX WARN: Code duplicated, block: B:132:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:140:0x024b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0268  */
    /* JADX WARN: Code duplicated, block: B:145:0x026a  */
    /* JADX WARN: Code duplicated, block: B:147:0x026d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0285 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0289  */
    /* JADX WARN: Code duplicated, block: B:152:0x028d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0297 A[LOOP:0: B:153:0x0295->B:154:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x0370  */
    /* JADX WARN: Code duplicated, block: B:162:0x0381  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(float f2, j81<? super Float, sd5> j81Var, pg2 pg2Var, boolean z, rt<Float> rtVar, int i, h81<sd5> h81Var, ci2 ci2Var, sm4 sm4Var, g30 g30Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        rt<Float> rtVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        h81<sd5> h81Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj;
        pg2 pg2Var2;
        boolean z2;
        rt<Float> ptVar;
        ci2 ci2Var2;
        rt<Float> rtVar3;
        int i15;
        ci2 ci2Var3;
        pg2 pg2Var3;
        boolean z3;
        boolean z4;
        rt<Float> rtVar4;
        int i16;
        ci2 ci2Var4;
        sm4 sm4Var2;
        h81<sd5> h81Var3;
        pg2 pg2Var4;
        int i17;
        Object objB0;
        boolean z5;
        boolean zI;
        Object objB1;
        int i18;
        ArrayList arrayList;
        int i19;
        Object obj2;
        pg2 pg2Var5;
        h81<sd5> h81Var4;
        sm4 sm4Var3;
        boolean z6;
        int i20;
        ci2 ci2Var5;
        rt<Float> rtVar5;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1962335196);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (j30VarQ.g(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i21 = i3 & 4;
        if (i21 == 0) {
            if ((i2 & 896) == 0) {
                i4 |= j30VarQ.I(pg2Var) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    if (j30VarQ.c(z)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        rtVar2 = rtVar;
                        int i22 = j30VarQ.I(rtVar2) ? 16384 : 8192;
                        i4 |= i22;
                    } else {
                        rtVar2 = rtVar;
                    }
                    i4 |= i22;
                } else {
                    rtVar2 = rtVar;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        i8 = i;
                        if (j30VarQ.i(i8)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        if ((3670016 & i2) == 0) {
                            h81Var2 = h81Var;
                            if (j30VarQ.I(h81Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                        i12 = i3 & 128;
                        if (i12 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 29360128) == 0) {
                            if (j30VarQ.I(ci2Var)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i4 |= i13;
                        }
                        if ((i2 & 234881024) != 0) {
                            i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                        }
                        if ((i4 & 191739611) == 38347922 || !j30VarQ.t()) {
                            j30VarQ.t0();
                            i14 = i2 & 1;
                            obj = g30.QnHx.a;
                            if (i14 != 0 || j30VarQ.Y()) {
                                if (i21 != 0) {
                                    pg2Var2 = pg2.QnHx.w;
                                } else {
                                    pg2Var2 = pg2Var;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if ((i3 & 16) != 0) {
                                    ptVar = new pt(0.0f, 1.0f);
                                    i4 &= -57345;
                                } else {
                                    ptVar = rtVar;
                                }
                                if (i7 != 0) {
                                    i8 = 0;
                                }
                                if (i10 != 0) {
                                    h81Var2 = null;
                                }
                                if (i12 != 0) {
                                    j30VarQ.e(-492369756);
                                    objB0 = j30VarQ.b0();
                                    if (objB0 == obj) {
                                        objB0 = new di2();
                                        j30VarQ.F0(objB0);
                                    }
                                    j30VarQ.R(false);
                                    ci2Var2 = (ci2) objB0;
                                } else {
                                    ci2Var2 = ci2Var;
                                }
                                if ((i3 & 256) != 0) {
                                    j30VarQ.e(436017687);
                                    lg3 lg3Var = sv.a;
                                    long jG = ((rv) j30VarQ.E(lg3Var)).g();
                                    boolean z7 = z2;
                                    long jL = hH.l(yu.b(((rv) j30VarQ.E(lg3Var)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var)).k());
                                    long jG2 = ((rv) j30VarQ.E(lg3Var)).g();
                                    long jB = yu.b(jG2, 0.24f);
                                    long jB2 = yu.b(((rv) j30VarQ.E(lg3Var)).f(), 0.32f);
                                    long jB3 = yu.b(jB2, 0.12f);
                                    int i23 = i8;
                                    long jB4 = yu.b(sv.b(jG2, j30VarQ), 0.54f);
                                    vh0 vh0Var = new vh0(jG, jL, jG2, jB, jB2, jB3, jB4, yu.b(jG2, 0.54f), yu.b(jB4, 0.12f), yu.b(jB3, 0.12f));
                                    j30VarQ.R(false);
                                    z4 = z7;
                                    rtVar4 = ptVar;
                                    i16 = i23;
                                    ci2Var4 = ci2Var2;
                                    sm4Var2 = vh0Var;
                                    h81Var3 = h81Var2;
                                    pg2Var4 = pg2Var2;
                                    i17 = i4 & (-234881025);
                                } else {
                                    boolean z8 = z2;
                                    rtVar3 = ptVar;
                                    i15 = i4;
                                    ci2Var3 = ci2Var2;
                                    pg2Var3 = pg2Var2;
                                    z3 = z8;
                                }
                                j30VarQ.S();
                                if (i16 >= 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    throw new IllegalArgumentException("steps should be >= 0".toString());
                                }
                                ri2 ri2VarF0 = ps0.f0(j81Var, j30VarQ);
                                Object objValueOf = Integer.valueOf(i16);
                                j30VarQ.e(1157296644);
                                zI = j30VarQ.I(objValueOf);
                                objB1 = j30VarQ.b0();
                                if (zI || objB1 == obj) {
                                    if (i16 == 0) {
                                        arrayList = cs0.w;
                                    } else {
                                        i18 = i16 + 2;
                                        arrayList = new ArrayList(i18);
                                        for (i19 = 0; i19 < i18; i19++) {
                                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                        }
                                    }
                                    j30VarQ.F0(arrayList);
                                    obj2 = arrayList;
                                }
                                j30VarQ.R(false);
                                List list = (List) obj2;
                                jt4 jt4Var = f95.a;
                                wo1.QnHx qnHx = wo1.a;
                                pg2 pg2VarA = f30.a(pg2Var4, qnHx, g95.w);
                                float f3 = 2 * a;
                                pg2 pg2VarA2 = c94.a(c94.a(pg2VarA.y(new lm4(f3, f3, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                                vo1 vo1Var = y31.a;
                                ci2 ci2Var6 = ci2Var4;
                                int i24 = i16;
                                rt<Float> rtVar6 = rtVar4;
                                boolean z9 = z4;
                                ne.a(f30.a(pg2VarA2, qnHx, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list, sm4Var2, ri2VarF0, h81Var3)), j30VarQ, 3072, 6);
                                pg2Var5 = pg2Var4;
                                h81Var4 = h81Var3;
                                sm4Var3 = sm4Var2;
                                z6 = z9;
                                i20 = i24;
                                ci2Var5 = ci2Var6;
                                rtVar5 = rtVar6;
                            } else {
                                j30VarQ.x();
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                z3 = z;
                                rtVar3 = rtVar;
                                ci2Var3 = ci2Var;
                                i15 = i4;
                                pg2Var3 = pg2Var;
                            }
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                            j30VarQ.S();
                            if (i16 >= 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                throw new IllegalArgumentException("steps should be >= 0".toString());
                            }
                            ri2 ri2VarF1 = ps0.f0(j81Var, j30VarQ);
                            Object objValueOf2 = Integer.valueOf(i16);
                            j30VarQ.e(1157296644);
                            zI = j30VarQ.I(objValueOf2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                if (i16 == 0) {
                                    arrayList = cs0.w;
                                } else {
                                    i18 = i16 + 2;
                                    arrayList = new ArrayList(i18);
                                    while (i19 < i18) {
                                        arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                    }
                                }
                                j30VarQ.F0(arrayList);
                                obj2 = arrayList;
                            } else {
                                if (i16 == 0) {
                                    arrayList = cs0.w;
                                } else {
                                    i18 = i16 + 2;
                                    arrayList = new ArrayList(i18);
                                    while (i19 < i18) {
                                        arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                    }
                                }
                                j30VarQ.F0(arrayList);
                                obj2 = arrayList;
                            }
                            j30VarQ.R(false);
                            List list2 = (List) obj2;
                            jt4 jt4Var2 = f95.a;
                            wo1.QnHx qnHx2 = wo1.a;
                            pg2 pg2VarA3 = f30.a(pg2Var4, qnHx2, g95.w);
                            float f4 = 2 * a;
                            pg2 pg2VarA4 = c94.a(c94.a(pg2VarA3.y(new lm4(f4, f4, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list2, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                            vo1 vo1Var2 = y31.a;
                            ci2 ci2Var7 = ci2Var4;
                            int i25 = i16;
                            rt<Float> rtVar7 = rtVar4;
                            boolean z10 = z4;
                            ne.a(f30.a(pg2VarA4, qnHx2, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list2, sm4Var2, ri2VarF1, h81Var3)), j30VarQ, 3072, 6);
                            pg2Var5 = pg2Var4;
                            h81Var4 = h81Var3;
                            sm4Var3 = sm4Var2;
                            z6 = z10;
                            i20 = i25;
                            ci2Var5 = ci2Var7;
                            rtVar5 = rtVar7;
                        } else {
                            j30VarQ.x();
                            pg2Var5 = pg2Var;
                            z6 = z;
                            sm4Var3 = sm4Var;
                            rtVar5 = rtVar2;
                            i20 = i8;
                            h81Var4 = h81Var2;
                            ci2Var5 = ci2Var;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
                    }
                    i4 |= 1572864;
                    h81Var2 = h81Var;
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (j30VarQ.I(ci2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) != 0) {
                        i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                    }
                    if ((i4 & 191739611) == 38347922) {
                        j30VarQ.t0();
                        i14 = i2 & 1;
                        obj = g30.QnHx.a;
                        if (i14 != 0) {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var2 = sv.a;
                                long jG3 = ((rv) j30VarQ.E(lg3Var2)).g();
                                boolean z11 = z2;
                                long jL2 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var2)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var2)).k());
                                long jG4 = ((rv) j30VarQ.E(lg3Var2)).g();
                                long jB5 = yu.b(jG4, 0.24f);
                                long jB6 = yu.b(((rv) j30VarQ.E(lg3Var2)).f(), 0.32f);
                                long jB7 = yu.b(jB6, 0.12f);
                                int i26 = i8;
                                long jB8 = yu.b(sv.b(jG4, j30VarQ), 0.54f);
                                vh0 vh0Var2 = new vh0(jG3, jL2, jG4, jB5, jB6, jB7, jB8, yu.b(jG4, 0.54f), yu.b(jB8, 0.12f), yu.b(jB7, 0.12f));
                                j30VarQ.R(false);
                                z4 = z11;
                                rtVar4 = ptVar;
                                i16 = i26;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var2;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z12 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z12;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        } else {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var3 = sv.a;
                                long jG5 = ((rv) j30VarQ.E(lg3Var3)).g();
                                boolean z13 = z2;
                                long jL3 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var3)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var3)).k());
                                long jG6 = ((rv) j30VarQ.E(lg3Var3)).g();
                                long jB9 = yu.b(jG6, 0.24f);
                                long jB10 = yu.b(((rv) j30VarQ.E(lg3Var3)).f(), 0.32f);
                                long jB11 = yu.b(jB10, 0.12f);
                                int i27 = i8;
                                long jB12 = yu.b(sv.b(jG6, j30VarQ), 0.54f);
                                vh0 vh0Var3 = new vh0(jG5, jL3, jG6, jB9, jB10, jB11, jB12, yu.b(jG6, 0.54f), yu.b(jB12, 0.12f), yu.b(jB11, 0.12f));
                                j30VarQ.R(false);
                                z4 = z13;
                                rtVar4 = ptVar;
                                i16 = i27;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var3;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z14 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z14;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        }
                        j30VarQ.S();
                        if (i16 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        ri2 ri2VarF2 = ps0.f0(j81Var, j30VarQ);
                        Object objValueOf3 = Integer.valueOf(i16);
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(objValueOf3);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        }
                        j30VarQ.R(false);
                        List list3 = (List) obj2;
                        jt4 jt4Var3 = f95.a;
                        wo1.QnHx qnHx3 = wo1.a;
                        pg2 pg2VarA5 = f30.a(pg2Var4, qnHx3, g95.w);
                        float f5 = 2 * a;
                        pg2 pg2VarA6 = c94.a(c94.a(pg2VarA5.y(new lm4(f5, f5, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list3, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                        vo1 vo1Var3 = y31.a;
                        ci2 ci2Var8 = ci2Var4;
                        int i28 = i16;
                        rt<Float> rtVar8 = rtVar4;
                        boolean z15 = z4;
                        ne.a(f30.a(pg2VarA6, qnHx3, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list3, sm4Var2, ri2VarF2, h81Var3)), j30VarQ, 3072, 6);
                        pg2Var5 = pg2Var4;
                        h81Var4 = h81Var3;
                        sm4Var3 = sm4Var2;
                        z6 = z15;
                        i20 = i28;
                        ci2Var5 = ci2Var8;
                        rtVar5 = rtVar8;
                    } else {
                        j30VarQ.t0();
                        i14 = i2 & 1;
                        obj = g30.QnHx.a;
                        if (i14 != 0) {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var4 = sv.a;
                                long jG7 = ((rv) j30VarQ.E(lg3Var4)).g();
                                boolean z16 = z2;
                                long jL4 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var4)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var4)).k());
                                long jG8 = ((rv) j30VarQ.E(lg3Var4)).g();
                                long jB13 = yu.b(jG8, 0.24f);
                                long jB14 = yu.b(((rv) j30VarQ.E(lg3Var4)).f(), 0.32f);
                                long jB15 = yu.b(jB14, 0.12f);
                                int i29 = i8;
                                long jB16 = yu.b(sv.b(jG8, j30VarQ), 0.54f);
                                vh0 vh0Var4 = new vh0(jG7, jL4, jG8, jB13, jB14, jB15, jB16, yu.b(jG8, 0.54f), yu.b(jB16, 0.12f), yu.b(jB15, 0.12f));
                                j30VarQ.R(false);
                                z4 = z16;
                                rtVar4 = ptVar;
                                i16 = i29;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var4;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z17 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z17;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        } else {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var5 = sv.a;
                                long jG9 = ((rv) j30VarQ.E(lg3Var5)).g();
                                boolean z18 = z2;
                                long jL5 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var5)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var5)).k());
                                long jG10 = ((rv) j30VarQ.E(lg3Var5)).g();
                                long jB17 = yu.b(jG10, 0.24f);
                                long jB18 = yu.b(((rv) j30VarQ.E(lg3Var5)).f(), 0.32f);
                                long jB19 = yu.b(jB18, 0.12f);
                                int i210 = i8;
                                long jB110 = yu.b(sv.b(jG10, j30VarQ), 0.54f);
                                vh0 vh0Var5 = new vh0(jG9, jL5, jG10, jB17, jB18, jB19, jB110, yu.b(jG10, 0.54f), yu.b(jB110, 0.12f), yu.b(jB19, 0.12f));
                                j30VarQ.R(false);
                                z4 = z18;
                                rtVar4 = ptVar;
                                i16 = i210;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var5;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z19 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z19;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        }
                        j30VarQ.S();
                        if (i16 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        ri2 ri2VarF3 = ps0.f0(j81Var, j30VarQ);
                        Object objValueOf4 = Integer.valueOf(i16);
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(objValueOf4);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        }
                        j30VarQ.R(false);
                        List list4 = (List) obj2;
                        jt4 jt4Var4 = f95.a;
                        wo1.QnHx qnHx4 = wo1.a;
                        pg2 pg2VarA7 = f30.a(pg2Var4, qnHx4, g95.w);
                        float f6 = 2 * a;
                        pg2 pg2VarA8 = c94.a(c94.a(pg2VarA7.y(new lm4(f6, f6, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list4, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                        vo1 vo1Var4 = y31.a;
                        ci2 ci2Var9 = ci2Var4;
                        int i211 = i16;
                        rt<Float> rtVar9 = rtVar4;
                        boolean z110 = z4;
                        ne.a(f30.a(pg2VarA8, qnHx4, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list4, sm4Var2, ri2VarF3, h81Var3)), j30VarQ, 3072, 6);
                        pg2Var5 = pg2Var4;
                        h81Var4 = h81Var3;
                        sm4Var3 = sm4Var2;
                        z6 = z110;
                        i20 = i211;
                        ci2Var5 = ci2Var9;
                        rtVar5 = rtVar9;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
                }
                i4 |= 196608;
                i8 = i;
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (j30VarQ.I(ci2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) != 0) {
                        i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                    }
                    if ((i4 & 191739611) == 38347922) {
                        j30VarQ.t0();
                        i14 = i2 & 1;
                        obj = g30.QnHx.a;
                        if (i14 != 0) {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var6 = sv.a;
                                long jG11 = ((rv) j30VarQ.E(lg3Var6)).g();
                                boolean z111 = z2;
                                long jL6 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var6)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var6)).k());
                                long jG12 = ((rv) j30VarQ.E(lg3Var6)).g();
                                long jB111 = yu.b(jG12, 0.24f);
                                long jB112 = yu.b(((rv) j30VarQ.E(lg3Var6)).f(), 0.32f);
                                long jB113 = yu.b(jB112, 0.12f);
                                int i212 = i8;
                                long jB114 = yu.b(sv.b(jG12, j30VarQ), 0.54f);
                                vh0 vh0Var6 = new vh0(jG11, jL6, jG12, jB111, jB112, jB113, jB114, yu.b(jG12, 0.54f), yu.b(jB114, 0.12f), yu.b(jB113, 0.12f));
                                j30VarQ.R(false);
                                z4 = z111;
                                rtVar4 = ptVar;
                                i16 = i212;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var6;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z112 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z112;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        } else {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var7 = sv.a;
                                long jG13 = ((rv) j30VarQ.E(lg3Var7)).g();
                                boolean z113 = z2;
                                long jL7 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var7)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var7)).k());
                                long jG14 = ((rv) j30VarQ.E(lg3Var7)).g();
                                long jB115 = yu.b(jG14, 0.24f);
                                long jB116 = yu.b(((rv) j30VarQ.E(lg3Var7)).f(), 0.32f);
                                long jB117 = yu.b(jB116, 0.12f);
                                int i213 = i8;
                                long jB118 = yu.b(sv.b(jG14, j30VarQ), 0.54f);
                                vh0 vh0Var7 = new vh0(jG13, jL7, jG14, jB115, jB116, jB117, jB118, yu.b(jG14, 0.54f), yu.b(jB118, 0.12f), yu.b(jB117, 0.12f));
                                j30VarQ.R(false);
                                z4 = z113;
                                rtVar4 = ptVar;
                                i16 = i213;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var7;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z114 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z114;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        }
                        j30VarQ.S();
                        if (i16 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        ri2 ri2VarF4 = ps0.f0(j81Var, j30VarQ);
                        Object objValueOf5 = Integer.valueOf(i16);
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(objValueOf5);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        }
                        j30VarQ.R(false);
                        List list5 = (List) obj2;
                        jt4 jt4Var5 = f95.a;
                        wo1.QnHx qnHx5 = wo1.a;
                        pg2 pg2VarA9 = f30.a(pg2Var4, qnHx5, g95.w);
                        float f7 = 2 * a;
                        pg2 pg2VarA10 = c94.a(c94.a(pg2VarA9.y(new lm4(f7, f7, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list5, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                        vo1 vo1Var5 = y31.a;
                        ci2 ci2Var10 = ci2Var4;
                        int i214 = i16;
                        rt<Float> rtVar10 = rtVar4;
                        boolean z115 = z4;
                        ne.a(f30.a(pg2VarA10, qnHx5, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list5, sm4Var2, ri2VarF4, h81Var3)), j30VarQ, 3072, 6);
                        pg2Var5 = pg2Var4;
                        h81Var4 = h81Var3;
                        sm4Var3 = sm4Var2;
                        z6 = z115;
                        i20 = i214;
                        ci2Var5 = ci2Var10;
                        rtVar5 = rtVar10;
                    } else {
                        j30VarQ.t0();
                        i14 = i2 & 1;
                        obj = g30.QnHx.a;
                        if (i14 != 0) {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var8 = sv.a;
                                long jG15 = ((rv) j30VarQ.E(lg3Var8)).g();
                                boolean z116 = z2;
                                long jL8 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var8)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var8)).k());
                                long jG16 = ((rv) j30VarQ.E(lg3Var8)).g();
                                long jB119 = yu.b(jG16, 0.24f);
                                long jB1110 = yu.b(((rv) j30VarQ.E(lg3Var8)).f(), 0.32f);
                                long jB1111 = yu.b(jB1110, 0.12f);
                                int i215 = i8;
                                long jB1112 = yu.b(sv.b(jG16, j30VarQ), 0.54f);
                                vh0 vh0Var8 = new vh0(jG15, jL8, jG16, jB119, jB1110, jB1111, jB1112, yu.b(jG16, 0.54f), yu.b(jB1112, 0.12f), yu.b(jB1111, 0.12f));
                                j30VarQ.R(false);
                                z4 = z116;
                                rtVar4 = ptVar;
                                i16 = i215;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z117 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z117;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        } else {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var9 = sv.a;
                                long jG17 = ((rv) j30VarQ.E(lg3Var9)).g();
                                boolean z118 = z2;
                                long jL9 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var9)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var9)).k());
                                long jG18 = ((rv) j30VarQ.E(lg3Var9)).g();
                                long jB1113 = yu.b(jG18, 0.24f);
                                long jB1114 = yu.b(((rv) j30VarQ.E(lg3Var9)).f(), 0.32f);
                                long jB1115 = yu.b(jB1114, 0.12f);
                                int i216 = i8;
                                long jB1116 = yu.b(sv.b(jG18, j30VarQ), 0.54f);
                                vh0 vh0Var9 = new vh0(jG17, jL9, jG18, jB1113, jB1114, jB1115, jB1116, yu.b(jG18, 0.54f), yu.b(jB1116, 0.12f), yu.b(jB1115, 0.12f));
                                j30VarQ.R(false);
                                z4 = z118;
                                rtVar4 = ptVar;
                                i16 = i216;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var9;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z119 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z119;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        }
                        j30VarQ.S();
                        if (i16 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        ri2 ri2VarF5 = ps0.f0(j81Var, j30VarQ);
                        Object objValueOf6 = Integer.valueOf(i16);
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(objValueOf6);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        }
                        j30VarQ.R(false);
                        List list6 = (List) obj2;
                        jt4 jt4Var6 = f95.a;
                        wo1.QnHx qnHx6 = wo1.a;
                        pg2 pg2VarA11 = f30.a(pg2Var4, qnHx6, g95.w);
                        float f8 = 2 * a;
                        pg2 pg2VarA12 = c94.a(c94.a(pg2VarA11.y(new lm4(f8, f8, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list6, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                        vo1 vo1Var6 = y31.a;
                        ci2 ci2Var11 = ci2Var4;
                        int i217 = i16;
                        rt<Float> rtVar11 = rtVar4;
                        boolean z1110 = z4;
                        ne.a(f30.a(pg2VarA12, qnHx6, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list6, sm4Var2, ri2VarF5, h81Var3)), j30VarQ, 3072, 6);
                        pg2Var5 = pg2Var4;
                        h81Var4 = h81Var3;
                        sm4Var3 = sm4Var2;
                        z6 = z1110;
                        i20 = i217;
                        ci2Var5 = ci2Var11;
                        rtVar5 = rtVar11;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
                }
                i4 |= 1572864;
                h81Var2 = h81Var;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (j30VarQ.I(ci2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var10 = sv.a;
                            long jG19 = ((rv) j30VarQ.E(lg3Var10)).g();
                            boolean z1111 = z2;
                            long jL10 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var10)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var10)).k());
                            long jG110 = ((rv) j30VarQ.E(lg3Var10)).g();
                            long jB1117 = yu.b(jG110, 0.24f);
                            long jB1118 = yu.b(((rv) j30VarQ.E(lg3Var10)).f(), 0.32f);
                            long jB1119 = yu.b(jB1118, 0.12f);
                            int i218 = i8;
                            long jB11110 = yu.b(sv.b(jG110, j30VarQ), 0.54f);
                            vh0 vh0Var10 = new vh0(jG19, jL10, jG110, jB1117, jB1118, jB1119, jB11110, yu.b(jG110, 0.54f), yu.b(jB11110, 0.12f), yu.b(jB1119, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111;
                            rtVar4 = ptVar;
                            i16 = i218;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var10;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1112 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1112;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var11 = sv.a;
                            long jG111 = ((rv) j30VarQ.E(lg3Var11)).g();
                            boolean z1113 = z2;
                            long jL11 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11)).k());
                            long jG112 = ((rv) j30VarQ.E(lg3Var11)).g();
                            long jB11111 = yu.b(jG112, 0.24f);
                            long jB11112 = yu.b(((rv) j30VarQ.E(lg3Var11)).f(), 0.32f);
                            long jB11113 = yu.b(jB11112, 0.12f);
                            int i219 = i8;
                            long jB11114 = yu.b(sv.b(jG112, j30VarQ), 0.54f);
                            vh0 vh0Var11 = new vh0(jG111, jL11, jG112, jB11111, jB11112, jB11113, jB11114, yu.b(jG112, 0.54f), yu.b(jB11114, 0.12f), yu.b(jB11113, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1113;
                            rtVar4 = ptVar;
                            i16 = i219;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var11;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1114 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1114;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF6 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf7 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf7);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list7 = (List) obj2;
                    jt4 jt4Var7 = f95.a;
                    wo1.QnHx qnHx7 = wo1.a;
                    pg2 pg2VarA13 = f30.a(pg2Var4, qnHx7, g95.w);
                    float f9 = 2 * a;
                    pg2 pg2VarA14 = c94.a(c94.a(pg2VarA13.y(new lm4(f9, f9, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list7, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var7 = y31.a;
                    ci2 ci2Var12 = ci2Var4;
                    int i2110 = i16;
                    rt<Float> rtVar12 = rtVar4;
                    boolean z1115 = z4;
                    ne.a(f30.a(pg2VarA14, qnHx7, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list7, sm4Var2, ri2VarF6, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z1115;
                    i20 = i2110;
                    ci2Var5 = ci2Var12;
                    rtVar5 = rtVar12;
                } else {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var12 = sv.a;
                            long jG113 = ((rv) j30VarQ.E(lg3Var12)).g();
                            boolean z1116 = z2;
                            long jL12 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var12)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var12)).k());
                            long jG114 = ((rv) j30VarQ.E(lg3Var12)).g();
                            long jB11115 = yu.b(jG114, 0.24f);
                            long jB11116 = yu.b(((rv) j30VarQ.E(lg3Var12)).f(), 0.32f);
                            long jB11117 = yu.b(jB11116, 0.12f);
                            int i2111 = i8;
                            long jB11118 = yu.b(sv.b(jG114, j30VarQ), 0.54f);
                            vh0 vh0Var12 = new vh0(jG113, jL12, jG114, jB11115, jB11116, jB11117, jB11118, yu.b(jG114, 0.54f), yu.b(jB11118, 0.12f), yu.b(jB11117, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1116;
                            rtVar4 = ptVar;
                            i16 = i2111;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var12;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1117 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1117;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var13 = sv.a;
                            long jG115 = ((rv) j30VarQ.E(lg3Var13)).g();
                            boolean z1118 = z2;
                            long jL13 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var13)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var13)).k());
                            long jG116 = ((rv) j30VarQ.E(lg3Var13)).g();
                            long jB11119 = yu.b(jG116, 0.24f);
                            long jB111110 = yu.b(((rv) j30VarQ.E(lg3Var13)).f(), 0.32f);
                            long jB111111 = yu.b(jB111110, 0.12f);
                            int i2112 = i8;
                            long jB111112 = yu.b(sv.b(jG116, j30VarQ), 0.54f);
                            vh0 vh0Var13 = new vh0(jG115, jL13, jG116, jB11119, jB111110, jB111111, jB111112, yu.b(jG116, 0.54f), yu.b(jB111112, 0.12f), yu.b(jB111111, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1118;
                            rtVar4 = ptVar;
                            i16 = i2112;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var13;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1119 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1119;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF7 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf8 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf8);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list8 = (List) obj2;
                    jt4 jt4Var8 = f95.a;
                    wo1.QnHx qnHx8 = wo1.a;
                    pg2 pg2VarA15 = f30.a(pg2Var4, qnHx8, g95.w);
                    float f10 = 2 * a;
                    pg2 pg2VarA16 = c94.a(c94.a(pg2VarA15.y(new lm4(f10, f10, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list8, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var8 = y31.a;
                    ci2 ci2Var13 = ci2Var4;
                    int i2113 = i16;
                    rt<Float> rtVar13 = rtVar4;
                    boolean z11110 = z4;
                    ne.a(f30.a(pg2VarA16, qnHx8, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list8, sm4Var2, ri2VarF7, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z11110;
                    i20 = i2113;
                    ci2Var5 = ci2Var13;
                    rtVar5 = rtVar13;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
            }
            i4 |= 3072;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    rtVar2 = rtVar;
                    if (j30VarQ.I(rtVar2)) {
                    }
                    i4 |= i22;
                } else {
                    rtVar2 = rtVar;
                }
                i4 |= i22;
            } else {
                rtVar2 = rtVar;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (j30VarQ.i(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (j30VarQ.I(ci2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) != 0) {
                        i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                    }
                    if ((i4 & 191739611) == 38347922) {
                        j30VarQ.t0();
                        i14 = i2 & 1;
                        obj = g30.QnHx.a;
                        if (i14 != 0) {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var14 = sv.a;
                                long jG117 = ((rv) j30VarQ.E(lg3Var14)).g();
                                boolean z11111 = z2;
                                long jL14 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var14)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var14)).k());
                                long jG118 = ((rv) j30VarQ.E(lg3Var14)).g();
                                long jB111113 = yu.b(jG118, 0.24f);
                                long jB111114 = yu.b(((rv) j30VarQ.E(lg3Var14)).f(), 0.32f);
                                long jB111115 = yu.b(jB111114, 0.12f);
                                int i2114 = i8;
                                long jB111116 = yu.b(sv.b(jG118, j30VarQ), 0.54f);
                                vh0 vh0Var14 = new vh0(jG117, jL14, jG118, jB111113, jB111114, jB111115, jB111116, yu.b(jG118, 0.54f), yu.b(jB111116, 0.12f), yu.b(jB111115, 0.12f));
                                j30VarQ.R(false);
                                z4 = z11111;
                                rtVar4 = ptVar;
                                i16 = i2114;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var14;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z11112 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z11112;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        } else {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var15 = sv.a;
                                long jG119 = ((rv) j30VarQ.E(lg3Var15)).g();
                                boolean z11113 = z2;
                                long jL15 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var15)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var15)).k());
                                long jG1110 = ((rv) j30VarQ.E(lg3Var15)).g();
                                long jB111117 = yu.b(jG1110, 0.24f);
                                long jB111118 = yu.b(((rv) j30VarQ.E(lg3Var15)).f(), 0.32f);
                                long jB111119 = yu.b(jB111118, 0.12f);
                                int i2115 = i8;
                                long jB1111110 = yu.b(sv.b(jG1110, j30VarQ), 0.54f);
                                vh0 vh0Var15 = new vh0(jG119, jL15, jG1110, jB111117, jB111118, jB111119, jB1111110, yu.b(jG1110, 0.54f), yu.b(jB1111110, 0.12f), yu.b(jB111119, 0.12f));
                                j30VarQ.R(false);
                                z4 = z11113;
                                rtVar4 = ptVar;
                                i16 = i2115;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var15;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z11114 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z11114;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        }
                        j30VarQ.S();
                        if (i16 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        ri2 ri2VarF8 = ps0.f0(j81Var, j30VarQ);
                        Object objValueOf9 = Integer.valueOf(i16);
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(objValueOf9);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        }
                        j30VarQ.R(false);
                        List list9 = (List) obj2;
                        jt4 jt4Var9 = f95.a;
                        wo1.QnHx qnHx9 = wo1.a;
                        pg2 pg2VarA17 = f30.a(pg2Var4, qnHx9, g95.w);
                        float f11 = 2 * a;
                        pg2 pg2VarA18 = c94.a(c94.a(pg2VarA17.y(new lm4(f11, f11, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list9, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                        vo1 vo1Var9 = y31.a;
                        ci2 ci2Var14 = ci2Var4;
                        int i2116 = i16;
                        rt<Float> rtVar14 = rtVar4;
                        boolean z11115 = z4;
                        ne.a(f30.a(pg2VarA18, qnHx9, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list9, sm4Var2, ri2VarF8, h81Var3)), j30VarQ, 3072, 6);
                        pg2Var5 = pg2Var4;
                        h81Var4 = h81Var3;
                        sm4Var3 = sm4Var2;
                        z6 = z11115;
                        i20 = i2116;
                        ci2Var5 = ci2Var14;
                        rtVar5 = rtVar14;
                    } else {
                        j30VarQ.t0();
                        i14 = i2 & 1;
                        obj = g30.QnHx.a;
                        if (i14 != 0) {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var16 = sv.a;
                                long jG1111 = ((rv) j30VarQ.E(lg3Var16)).g();
                                boolean z11116 = z2;
                                long jL16 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var16)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var16)).k());
                                long jG1112 = ((rv) j30VarQ.E(lg3Var16)).g();
                                long jB1111111 = yu.b(jG1112, 0.24f);
                                long jB1111112 = yu.b(((rv) j30VarQ.E(lg3Var16)).f(), 0.32f);
                                long jB1111113 = yu.b(jB1111112, 0.12f);
                                int i2117 = i8;
                                long jB1111114 = yu.b(sv.b(jG1112, j30VarQ), 0.54f);
                                vh0 vh0Var16 = new vh0(jG1111, jL16, jG1112, jB1111111, jB1111112, jB1111113, jB1111114, yu.b(jG1112, 0.54f), yu.b(jB1111114, 0.12f), yu.b(jB1111113, 0.12f));
                                j30VarQ.R(false);
                                z4 = z11116;
                                rtVar4 = ptVar;
                                i16 = i2117;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var16;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z11117 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z11117;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        } else {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var17 = sv.a;
                                long jG1113 = ((rv) j30VarQ.E(lg3Var17)).g();
                                boolean z11118 = z2;
                                long jL17 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var17)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var17)).k());
                                long jG1114 = ((rv) j30VarQ.E(lg3Var17)).g();
                                long jB1111115 = yu.b(jG1114, 0.24f);
                                long jB1111116 = yu.b(((rv) j30VarQ.E(lg3Var17)).f(), 0.32f);
                                long jB1111117 = yu.b(jB1111116, 0.12f);
                                int i2118 = i8;
                                long jB1111118 = yu.b(sv.b(jG1114, j30VarQ), 0.54f);
                                vh0 vh0Var17 = new vh0(jG1113, jL17, jG1114, jB1111115, jB1111116, jB1111117, jB1111118, yu.b(jG1114, 0.54f), yu.b(jB1111118, 0.12f), yu.b(jB1111117, 0.12f));
                                j30VarQ.R(false);
                                z4 = z11118;
                                rtVar4 = ptVar;
                                i16 = i2118;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var17;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z11119 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z11119;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        }
                        j30VarQ.S();
                        if (i16 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        ri2 ri2VarF9 = ps0.f0(j81Var, j30VarQ);
                        Object objValueOf10 = Integer.valueOf(i16);
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(objValueOf10);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        }
                        j30VarQ.R(false);
                        List list10 = (List) obj2;
                        jt4 jt4Var10 = f95.a;
                        wo1.QnHx qnHx10 = wo1.a;
                        pg2 pg2VarA19 = f30.a(pg2Var4, qnHx10, g95.w);
                        float f12 = 2 * a;
                        pg2 pg2VarA110 = c94.a(c94.a(pg2VarA19.y(new lm4(f12, f12, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list10, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                        vo1 vo1Var10 = y31.a;
                        ci2 ci2Var15 = ci2Var4;
                        int i2119 = i16;
                        rt<Float> rtVar15 = rtVar4;
                        boolean z111110 = z4;
                        ne.a(f30.a(pg2VarA110, qnHx10, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list10, sm4Var2, ri2VarF9, h81Var3)), j30VarQ, 3072, 6);
                        pg2Var5 = pg2Var4;
                        h81Var4 = h81Var3;
                        sm4Var3 = sm4Var2;
                        z6 = z111110;
                        i20 = i2119;
                        ci2Var5 = ci2Var15;
                        rtVar5 = rtVar15;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
                }
                i4 |= 1572864;
                h81Var2 = h81Var;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (j30VarQ.I(ci2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var18 = sv.a;
                            long jG1115 = ((rv) j30VarQ.E(lg3Var18)).g();
                            boolean z111111 = z2;
                            long jL18 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var18)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var18)).k());
                            long jG1116 = ((rv) j30VarQ.E(lg3Var18)).g();
                            long jB1111119 = yu.b(jG1116, 0.24f);
                            long jB11111110 = yu.b(((rv) j30VarQ.E(lg3Var18)).f(), 0.32f);
                            long jB11111111 = yu.b(jB11111110, 0.12f);
                            int i21110 = i8;
                            long jB11111112 = yu.b(sv.b(jG1116, j30VarQ), 0.54f);
                            vh0 vh0Var18 = new vh0(jG1115, jL18, jG1116, jB1111119, jB11111110, jB11111111, jB11111112, yu.b(jG1116, 0.54f), yu.b(jB11111112, 0.12f), yu.b(jB11111111, 0.12f));
                            j30VarQ.R(false);
                            z4 = z111111;
                            rtVar4 = ptVar;
                            i16 = i21110;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var18;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z111112 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z111112;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var19 = sv.a;
                            long jG1117 = ((rv) j30VarQ.E(lg3Var19)).g();
                            boolean z111113 = z2;
                            long jL19 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var19)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var19)).k());
                            long jG1118 = ((rv) j30VarQ.E(lg3Var19)).g();
                            long jB11111113 = yu.b(jG1118, 0.24f);
                            long jB11111114 = yu.b(((rv) j30VarQ.E(lg3Var19)).f(), 0.32f);
                            long jB11111115 = yu.b(jB11111114, 0.12f);
                            int i21111 = i8;
                            long jB11111116 = yu.b(sv.b(jG1118, j30VarQ), 0.54f);
                            vh0 vh0Var19 = new vh0(jG1117, jL19, jG1118, jB11111113, jB11111114, jB11111115, jB11111116, yu.b(jG1118, 0.54f), yu.b(jB11111116, 0.12f), yu.b(jB11111115, 0.12f));
                            j30VarQ.R(false);
                            z4 = z111113;
                            rtVar4 = ptVar;
                            i16 = i21111;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var19;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z111114 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z111114;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF10 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf11 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf11);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list11 = (List) obj2;
                    jt4 jt4Var11 = f95.a;
                    wo1.QnHx qnHx11 = wo1.a;
                    pg2 pg2VarA111 = f30.a(pg2Var4, qnHx11, g95.w);
                    float f13 = 2 * a;
                    pg2 pg2VarA112 = c94.a(c94.a(pg2VarA111.y(new lm4(f13, f13, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list11, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var11 = y31.a;
                    ci2 ci2Var16 = ci2Var4;
                    int i21112 = i16;
                    rt<Float> rtVar16 = rtVar4;
                    boolean z111115 = z4;
                    ne.a(f30.a(pg2VarA112, qnHx11, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list11, sm4Var2, ri2VarF10, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z111115;
                    i20 = i21112;
                    ci2Var5 = ci2Var16;
                    rtVar5 = rtVar16;
                } else {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var110 = sv.a;
                            long jG1119 = ((rv) j30VarQ.E(lg3Var110)).g();
                            boolean z111116 = z2;
                            long jL110 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var110)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var110)).k());
                            long jG11110 = ((rv) j30VarQ.E(lg3Var110)).g();
                            long jB11111117 = yu.b(jG11110, 0.24f);
                            long jB11111118 = yu.b(((rv) j30VarQ.E(lg3Var110)).f(), 0.32f);
                            long jB11111119 = yu.b(jB11111118, 0.12f);
                            int i21113 = i8;
                            long jB111111110 = yu.b(sv.b(jG11110, j30VarQ), 0.54f);
                            vh0 vh0Var110 = new vh0(jG1119, jL110, jG11110, jB11111117, jB11111118, jB11111119, jB111111110, yu.b(jG11110, 0.54f), yu.b(jB111111110, 0.12f), yu.b(jB11111119, 0.12f));
                            j30VarQ.R(false);
                            z4 = z111116;
                            rtVar4 = ptVar;
                            i16 = i21113;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var110;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z111117 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z111117;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var111 = sv.a;
                            long jG11111 = ((rv) j30VarQ.E(lg3Var111)).g();
                            boolean z111118 = z2;
                            long jL111 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111)).k());
                            long jG11112 = ((rv) j30VarQ.E(lg3Var111)).g();
                            long jB111111111 = yu.b(jG11112, 0.24f);
                            long jB111111112 = yu.b(((rv) j30VarQ.E(lg3Var111)).f(), 0.32f);
                            long jB111111113 = yu.b(jB111111112, 0.12f);
                            int i21114 = i8;
                            long jB111111114 = yu.b(sv.b(jG11112, j30VarQ), 0.54f);
                            vh0 vh0Var111 = new vh0(jG11111, jL111, jG11112, jB111111111, jB111111112, jB111111113, jB111111114, yu.b(jG11112, 0.54f), yu.b(jB111111114, 0.12f), yu.b(jB111111113, 0.12f));
                            j30VarQ.R(false);
                            z4 = z111118;
                            rtVar4 = ptVar;
                            i16 = i21114;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var111;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z111119 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z111119;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF11 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf12 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf12);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list12 = (List) obj2;
                    jt4 jt4Var12 = f95.a;
                    wo1.QnHx qnHx12 = wo1.a;
                    pg2 pg2VarA113 = f30.a(pg2Var4, qnHx12, g95.w);
                    float f14 = 2 * a;
                    pg2 pg2VarA114 = c94.a(c94.a(pg2VarA113.y(new lm4(f14, f14, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list12, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var12 = y31.a;
                    ci2 ci2Var17 = ci2Var4;
                    int i21115 = i16;
                    rt<Float> rtVar17 = rtVar4;
                    boolean z1111110 = z4;
                    ne.a(f30.a(pg2VarA114, qnHx12, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list12, sm4Var2, ri2VarF11, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z1111110;
                    i20 = i21115;
                    ci2Var5 = ci2Var17;
                    rtVar5 = rtVar17;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (j30VarQ.I(ci2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var112 = sv.a;
                            long jG11113 = ((rv) j30VarQ.E(lg3Var112)).g();
                            boolean z1111111 = z2;
                            long jL112 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var112)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var112)).k());
                            long jG11114 = ((rv) j30VarQ.E(lg3Var112)).g();
                            long jB111111115 = yu.b(jG11114, 0.24f);
                            long jB111111116 = yu.b(((rv) j30VarQ.E(lg3Var112)).f(), 0.32f);
                            long jB111111117 = yu.b(jB111111116, 0.12f);
                            int i21116 = i8;
                            long jB111111118 = yu.b(sv.b(jG11114, j30VarQ), 0.54f);
                            vh0 vh0Var112 = new vh0(jG11113, jL112, jG11114, jB111111115, jB111111116, jB111111117, jB111111118, yu.b(jG11114, 0.54f), yu.b(jB111111118, 0.12f), yu.b(jB111111117, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111;
                            rtVar4 = ptVar;
                            i16 = i21116;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var112;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111112 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111112;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var113 = sv.a;
                            long jG11115 = ((rv) j30VarQ.E(lg3Var113)).g();
                            boolean z1111113 = z2;
                            long jL113 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var113)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var113)).k());
                            long jG11116 = ((rv) j30VarQ.E(lg3Var113)).g();
                            long jB111111119 = yu.b(jG11116, 0.24f);
                            long jB1111111110 = yu.b(((rv) j30VarQ.E(lg3Var113)).f(), 0.32f);
                            long jB1111111111 = yu.b(jB1111111110, 0.12f);
                            int i21117 = i8;
                            long jB1111111112 = yu.b(sv.b(jG11116, j30VarQ), 0.54f);
                            vh0 vh0Var113 = new vh0(jG11115, jL113, jG11116, jB111111119, jB1111111110, jB1111111111, jB1111111112, yu.b(jG11116, 0.54f), yu.b(jB1111111112, 0.12f), yu.b(jB1111111111, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111113;
                            rtVar4 = ptVar;
                            i16 = i21117;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var113;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111114 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111114;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF12 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf13 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf13);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list13 = (List) obj2;
                    jt4 jt4Var13 = f95.a;
                    wo1.QnHx qnHx13 = wo1.a;
                    pg2 pg2VarA115 = f30.a(pg2Var4, qnHx13, g95.w);
                    float f15 = 2 * a;
                    pg2 pg2VarA116 = c94.a(c94.a(pg2VarA115.y(new lm4(f15, f15, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list13, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var13 = y31.a;
                    ci2 ci2Var18 = ci2Var4;
                    int i21118 = i16;
                    rt<Float> rtVar18 = rtVar4;
                    boolean z1111115 = z4;
                    ne.a(f30.a(pg2VarA116, qnHx13, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list13, sm4Var2, ri2VarF12, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z1111115;
                    i20 = i21118;
                    ci2Var5 = ci2Var18;
                    rtVar5 = rtVar18;
                } else {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var114 = sv.a;
                            long jG11117 = ((rv) j30VarQ.E(lg3Var114)).g();
                            boolean z1111116 = z2;
                            long jL114 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var114)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var114)).k());
                            long jG11118 = ((rv) j30VarQ.E(lg3Var114)).g();
                            long jB1111111113 = yu.b(jG11118, 0.24f);
                            long jB1111111114 = yu.b(((rv) j30VarQ.E(lg3Var114)).f(), 0.32f);
                            long jB1111111115 = yu.b(jB1111111114, 0.12f);
                            int i21119 = i8;
                            long jB1111111116 = yu.b(sv.b(jG11118, j30VarQ), 0.54f);
                            vh0 vh0Var114 = new vh0(jG11117, jL114, jG11118, jB1111111113, jB1111111114, jB1111111115, jB1111111116, yu.b(jG11118, 0.54f), yu.b(jB1111111116, 0.12f), yu.b(jB1111111115, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111116;
                            rtVar4 = ptVar;
                            i16 = i21119;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var114;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111117 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111117;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var115 = sv.a;
                            long jG11119 = ((rv) j30VarQ.E(lg3Var115)).g();
                            boolean z1111118 = z2;
                            long jL115 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var115)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var115)).k());
                            long jG111110 = ((rv) j30VarQ.E(lg3Var115)).g();
                            long jB1111111117 = yu.b(jG111110, 0.24f);
                            long jB1111111118 = yu.b(((rv) j30VarQ.E(lg3Var115)).f(), 0.32f);
                            long jB1111111119 = yu.b(jB1111111118, 0.12f);
                            int i211110 = i8;
                            long jB11111111110 = yu.b(sv.b(jG111110, j30VarQ), 0.54f);
                            vh0 vh0Var115 = new vh0(jG11119, jL115, jG111110, jB1111111117, jB1111111118, jB1111111119, jB11111111110, yu.b(jG111110, 0.54f), yu.b(jB11111111110, 0.12f), yu.b(jB1111111119, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111118;
                            rtVar4 = ptVar;
                            i16 = i211110;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var115;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111119 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111119;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF13 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf14 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf14);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list14 = (List) obj2;
                    jt4 jt4Var14 = f95.a;
                    wo1.QnHx qnHx14 = wo1.a;
                    pg2 pg2VarA117 = f30.a(pg2Var4, qnHx14, g95.w);
                    float f16 = 2 * a;
                    pg2 pg2VarA118 = c94.a(c94.a(pg2VarA117.y(new lm4(f16, f16, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list14, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var14 = y31.a;
                    ci2 ci2Var19 = ci2Var4;
                    int i211111 = i16;
                    rt<Float> rtVar19 = rtVar4;
                    boolean z11111110 = z4;
                    ne.a(f30.a(pg2VarA118, qnHx14, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list14, sm4Var2, ri2VarF13, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z11111110;
                    i20 = i211111;
                    ci2Var5 = ci2Var19;
                    rtVar5 = rtVar19;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
            }
            i4 |= 1572864;
            h81Var2 = h81Var;
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (j30VarQ.I(ci2Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
            }
            if ((i4 & 191739611) == 38347922) {
                j30VarQ.t0();
                i14 = i2 & 1;
                obj = g30.QnHx.a;
                if (i14 != 0) {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var116 = sv.a;
                        long jG111111 = ((rv) j30VarQ.E(lg3Var116)).g();
                        boolean z11111111 = z2;
                        long jL116 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var116)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var116)).k());
                        long jG111112 = ((rv) j30VarQ.E(lg3Var116)).g();
                        long jB11111111111 = yu.b(jG111112, 0.24f);
                        long jB11111111112 = yu.b(((rv) j30VarQ.E(lg3Var116)).f(), 0.32f);
                        long jB11111111113 = yu.b(jB11111111112, 0.12f);
                        int i211112 = i8;
                        long jB11111111114 = yu.b(sv.b(jG111112, j30VarQ), 0.54f);
                        vh0 vh0Var116 = new vh0(jG111111, jL116, jG111112, jB11111111111, jB11111111112, jB11111111113, jB11111111114, yu.b(jG111112, 0.54f), yu.b(jB11111111114, 0.12f), yu.b(jB11111111113, 0.12f));
                        j30VarQ.R(false);
                        z4 = z11111111;
                        rtVar4 = ptVar;
                        i16 = i211112;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var116;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z11111112 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z11111112;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                } else {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var117 = sv.a;
                        long jG111113 = ((rv) j30VarQ.E(lg3Var117)).g();
                        boolean z11111113 = z2;
                        long jL117 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var117)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var117)).k());
                        long jG111114 = ((rv) j30VarQ.E(lg3Var117)).g();
                        long jB11111111115 = yu.b(jG111114, 0.24f);
                        long jB11111111116 = yu.b(((rv) j30VarQ.E(lg3Var117)).f(), 0.32f);
                        long jB11111111117 = yu.b(jB11111111116, 0.12f);
                        int i211113 = i8;
                        long jB11111111118 = yu.b(sv.b(jG111114, j30VarQ), 0.54f);
                        vh0 vh0Var117 = new vh0(jG111113, jL117, jG111114, jB11111111115, jB11111111116, jB11111111117, jB11111111118, yu.b(jG111114, 0.54f), yu.b(jB11111111118, 0.12f), yu.b(jB11111111117, 0.12f));
                        j30VarQ.R(false);
                        z4 = z11111113;
                        rtVar4 = ptVar;
                        i16 = i211113;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var117;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z11111114 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z11111114;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                }
                j30VarQ.S();
                if (i16 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                ri2 ri2VarF14 = ps0.f0(j81Var, j30VarQ);
                Object objValueOf15 = Integer.valueOf(i16);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(objValueOf15);
                objB1 = j30VarQ.b0();
                if (zI) {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                }
                j30VarQ.R(false);
                List list15 = (List) obj2;
                jt4 jt4Var15 = f95.a;
                wo1.QnHx qnHx15 = wo1.a;
                pg2 pg2VarA119 = f30.a(pg2Var4, qnHx15, g95.w);
                float f17 = 2 * a;
                pg2 pg2VarA1110 = c94.a(c94.a(pg2VarA119.y(new lm4(f17, f17, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list15, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                vo1 vo1Var15 = y31.a;
                ci2 ci2Var110 = ci2Var4;
                int i211114 = i16;
                rt<Float> rtVar110 = rtVar4;
                boolean z11111115 = z4;
                ne.a(f30.a(pg2VarA1110, qnHx15, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list15, sm4Var2, ri2VarF14, h81Var3)), j30VarQ, 3072, 6);
                pg2Var5 = pg2Var4;
                h81Var4 = h81Var3;
                sm4Var3 = sm4Var2;
                z6 = z11111115;
                i20 = i211114;
                ci2Var5 = ci2Var110;
                rtVar5 = rtVar110;
            } else {
                j30VarQ.t0();
                i14 = i2 & 1;
                obj = g30.QnHx.a;
                if (i14 != 0) {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var118 = sv.a;
                        long jG111115 = ((rv) j30VarQ.E(lg3Var118)).g();
                        boolean z11111116 = z2;
                        long jL118 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var118)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var118)).k());
                        long jG111116 = ((rv) j30VarQ.E(lg3Var118)).g();
                        long jB11111111119 = yu.b(jG111116, 0.24f);
                        long jB111111111110 = yu.b(((rv) j30VarQ.E(lg3Var118)).f(), 0.32f);
                        long jB111111111111 = yu.b(jB111111111110, 0.12f);
                        int i211115 = i8;
                        long jB111111111112 = yu.b(sv.b(jG111116, j30VarQ), 0.54f);
                        vh0 vh0Var118 = new vh0(jG111115, jL118, jG111116, jB11111111119, jB111111111110, jB111111111111, jB111111111112, yu.b(jG111116, 0.54f), yu.b(jB111111111112, 0.12f), yu.b(jB111111111111, 0.12f));
                        j30VarQ.R(false);
                        z4 = z11111116;
                        rtVar4 = ptVar;
                        i16 = i211115;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var118;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z11111117 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z11111117;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                } else {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var119 = sv.a;
                        long jG111117 = ((rv) j30VarQ.E(lg3Var119)).g();
                        boolean z11111118 = z2;
                        long jL119 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var119)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var119)).k());
                        long jG111118 = ((rv) j30VarQ.E(lg3Var119)).g();
                        long jB111111111113 = yu.b(jG111118, 0.24f);
                        long jB111111111114 = yu.b(((rv) j30VarQ.E(lg3Var119)).f(), 0.32f);
                        long jB111111111115 = yu.b(jB111111111114, 0.12f);
                        int i211116 = i8;
                        long jB111111111116 = yu.b(sv.b(jG111118, j30VarQ), 0.54f);
                        vh0 vh0Var119 = new vh0(jG111117, jL119, jG111118, jB111111111113, jB111111111114, jB111111111115, jB111111111116, yu.b(jG111118, 0.54f), yu.b(jB111111111116, 0.12f), yu.b(jB111111111115, 0.12f));
                        j30VarQ.R(false);
                        z4 = z11111118;
                        rtVar4 = ptVar;
                        i16 = i211116;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var119;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z11111119 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z11111119;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                }
                j30VarQ.S();
                if (i16 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                ri2 ri2VarF15 = ps0.f0(j81Var, j30VarQ);
                Object objValueOf16 = Integer.valueOf(i16);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(objValueOf16);
                objB1 = j30VarQ.b0();
                if (zI) {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                }
                j30VarQ.R(false);
                List list16 = (List) obj2;
                jt4 jt4Var16 = f95.a;
                wo1.QnHx qnHx16 = wo1.a;
                pg2 pg2VarA1111 = f30.a(pg2Var4, qnHx16, g95.w);
                float f18 = 2 * a;
                pg2 pg2VarA1112 = c94.a(c94.a(pg2VarA1111.y(new lm4(f18, f18, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list16, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                vo1 vo1Var16 = y31.a;
                ci2 ci2Var111 = ci2Var4;
                int i211117 = i16;
                rt<Float> rtVar111 = rtVar4;
                boolean z111111110 = z4;
                ne.a(f30.a(pg2VarA1112, qnHx16, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list16, sm4Var2, ri2VarF15, h81Var3)), j30VarQ, 3072, 6);
                pg2Var5 = pg2Var4;
                h81Var4 = h81Var3;
                sm4Var3 = sm4Var2;
                z6 = z111111110;
                i20 = i211117;
                ci2Var5 = ci2Var111;
                rtVar5 = rtVar111;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
        }
        i4 |= 384;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                if (j30VarQ.c(z)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    rtVar2 = rtVar;
                    if (j30VarQ.I(rtVar2)) {
                    }
                    i4 |= i22;
                } else {
                    rtVar2 = rtVar;
                }
                i4 |= i22;
            } else {
                rtVar2 = rtVar;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    i8 = i;
                    if (j30VarQ.i(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((3670016 & i2) == 0) {
                        h81Var2 = h81Var;
                        if (j30VarQ.I(h81Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        if (j30VarQ.I(ci2Var)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 234881024) != 0) {
                        i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                    }
                    if ((i4 & 191739611) == 38347922) {
                        j30VarQ.t0();
                        i14 = i2 & 1;
                        obj = g30.QnHx.a;
                        if (i14 != 0) {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var1110 = sv.a;
                                long jG111119 = ((rv) j30VarQ.E(lg3Var1110)).g();
                                boolean z111111111 = z2;
                                long jL1110 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1110)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1110)).k());
                                long jG1111110 = ((rv) j30VarQ.E(lg3Var1110)).g();
                                long jB111111111117 = yu.b(jG1111110, 0.24f);
                                long jB111111111118 = yu.b(((rv) j30VarQ.E(lg3Var1110)).f(), 0.32f);
                                long jB111111111119 = yu.b(jB111111111118, 0.12f);
                                int i211118 = i8;
                                long jB1111111111110 = yu.b(sv.b(jG1111110, j30VarQ), 0.54f);
                                vh0 vh0Var1110 = new vh0(jG111119, jL1110, jG1111110, jB111111111117, jB111111111118, jB111111111119, jB1111111111110, yu.b(jG1111110, 0.54f), yu.b(jB1111111111110, 0.12f), yu.b(jB111111111119, 0.12f));
                                j30VarQ.R(false);
                                z4 = z111111111;
                                rtVar4 = ptVar;
                                i16 = i211118;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var1110;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z111111112 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z111111112;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        } else {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var1111 = sv.a;
                                long jG1111111 = ((rv) j30VarQ.E(lg3Var1111)).g();
                                boolean z111111113 = z2;
                                long jL1111 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1111)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1111)).k());
                                long jG1111112 = ((rv) j30VarQ.E(lg3Var1111)).g();
                                long jB1111111111111 = yu.b(jG1111112, 0.24f);
                                long jB1111111111112 = yu.b(((rv) j30VarQ.E(lg3Var1111)).f(), 0.32f);
                                long jB1111111111113 = yu.b(jB1111111111112, 0.12f);
                                int i211119 = i8;
                                long jB1111111111114 = yu.b(sv.b(jG1111112, j30VarQ), 0.54f);
                                vh0 vh0Var1111 = new vh0(jG1111111, jL1111, jG1111112, jB1111111111111, jB1111111111112, jB1111111111113, jB1111111111114, yu.b(jG1111112, 0.54f), yu.b(jB1111111111114, 0.12f), yu.b(jB1111111111113, 0.12f));
                                j30VarQ.R(false);
                                z4 = z111111113;
                                rtVar4 = ptVar;
                                i16 = i211119;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var1111;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z111111114 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z111111114;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        }
                        j30VarQ.S();
                        if (i16 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        ri2 ri2VarF16 = ps0.f0(j81Var, j30VarQ);
                        Object objValueOf17 = Integer.valueOf(i16);
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(objValueOf17);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        }
                        j30VarQ.R(false);
                        List list17 = (List) obj2;
                        jt4 jt4Var17 = f95.a;
                        wo1.QnHx qnHx17 = wo1.a;
                        pg2 pg2VarA1113 = f30.a(pg2Var4, qnHx17, g95.w);
                        float f19 = 2 * a;
                        pg2 pg2VarA1114 = c94.a(c94.a(pg2VarA1113.y(new lm4(f19, f19, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list17, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                        vo1 vo1Var17 = y31.a;
                        ci2 ci2Var112 = ci2Var4;
                        int i2111110 = i16;
                        rt<Float> rtVar112 = rtVar4;
                        boolean z111111115 = z4;
                        ne.a(f30.a(pg2VarA1114, qnHx17, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list17, sm4Var2, ri2VarF16, h81Var3)), j30VarQ, 3072, 6);
                        pg2Var5 = pg2Var4;
                        h81Var4 = h81Var3;
                        sm4Var3 = sm4Var2;
                        z6 = z111111115;
                        i20 = i2111110;
                        ci2Var5 = ci2Var112;
                        rtVar5 = rtVar112;
                    } else {
                        j30VarQ.t0();
                        i14 = i2 & 1;
                        obj = g30.QnHx.a;
                        if (i14 != 0) {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var1112 = sv.a;
                                long jG1111113 = ((rv) j30VarQ.E(lg3Var1112)).g();
                                boolean z111111116 = z2;
                                long jL1112 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1112)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1112)).k());
                                long jG1111114 = ((rv) j30VarQ.E(lg3Var1112)).g();
                                long jB1111111111115 = yu.b(jG1111114, 0.24f);
                                long jB1111111111116 = yu.b(((rv) j30VarQ.E(lg3Var1112)).f(), 0.32f);
                                long jB1111111111117 = yu.b(jB1111111111116, 0.12f);
                                int i2111111 = i8;
                                long jB1111111111118 = yu.b(sv.b(jG1111114, j30VarQ), 0.54f);
                                vh0 vh0Var1112 = new vh0(jG1111113, jL1112, jG1111114, jB1111111111115, jB1111111111116, jB1111111111117, jB1111111111118, yu.b(jG1111114, 0.54f), yu.b(jB1111111111118, 0.12f), yu.b(jB1111111111117, 0.12f));
                                j30VarQ.R(false);
                                z4 = z111111116;
                                rtVar4 = ptVar;
                                i16 = i2111111;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var1112;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z111111117 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z111111117;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        } else {
                            if (i21 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i3 & 16) != 0) {
                                ptVar = new pt(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                ptVar = rtVar;
                            }
                            if (i7 != 0) {
                                i8 = 0;
                            }
                            if (i10 != 0) {
                                h81Var2 = null;
                            }
                            if (i12 != 0) {
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                if (objB0 == obj) {
                                    objB0 = new di2();
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ci2Var2 = (ci2) objB0;
                            } else {
                                ci2Var2 = ci2Var;
                            }
                            if ((i3 & 256) != 0) {
                                j30VarQ.e(436017687);
                                lg3 lg3Var1113 = sv.a;
                                long jG1111115 = ((rv) j30VarQ.E(lg3Var1113)).g();
                                boolean z111111118 = z2;
                                long jL1113 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1113)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1113)).k());
                                long jG1111116 = ((rv) j30VarQ.E(lg3Var1113)).g();
                                long jB1111111111119 = yu.b(jG1111116, 0.24f);
                                long jB11111111111110 = yu.b(((rv) j30VarQ.E(lg3Var1113)).f(), 0.32f);
                                long jB11111111111111 = yu.b(jB11111111111110, 0.12f);
                                int i2111112 = i8;
                                long jB11111111111112 = yu.b(sv.b(jG1111116, j30VarQ), 0.54f);
                                vh0 vh0Var1113 = new vh0(jG1111115, jL1113, jG1111116, jB1111111111119, jB11111111111110, jB11111111111111, jB11111111111112, yu.b(jG1111116, 0.54f), yu.b(jB11111111111112, 0.12f), yu.b(jB11111111111111, 0.12f));
                                j30VarQ.R(false);
                                z4 = z111111118;
                                rtVar4 = ptVar;
                                i16 = i2111112;
                                ci2Var4 = ci2Var2;
                                sm4Var2 = vh0Var1113;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var2;
                                i17 = i4 & (-234881025);
                            } else {
                                boolean z111111119 = z2;
                                rtVar3 = ptVar;
                                i15 = i4;
                                ci2Var3 = ci2Var2;
                                pg2Var3 = pg2Var2;
                                z3 = z111111119;
                                sm4Var2 = sm4Var;
                                z4 = z3;
                                ci2Var4 = ci2Var3;
                                i16 = i8;
                                h81Var3 = h81Var2;
                                pg2Var4 = pg2Var3;
                                rtVar4 = rtVar3;
                                i17 = i15;
                            }
                        }
                        j30VarQ.S();
                        if (i16 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        ri2 ri2VarF17 = ps0.f0(j81Var, j30VarQ);
                        Object objValueOf18 = Integer.valueOf(i16);
                        j30VarQ.e(1157296644);
                        zI = j30VarQ.I(objValueOf18);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i16 == 0) {
                                arrayList = cs0.w;
                            } else {
                                i18 = i16 + 2;
                                arrayList = new ArrayList(i18);
                                while (i19 < i18) {
                                    arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                                }
                            }
                            j30VarQ.F0(arrayList);
                            obj2 = arrayList;
                        }
                        j30VarQ.R(false);
                        List list18 = (List) obj2;
                        jt4 jt4Var18 = f95.a;
                        wo1.QnHx qnHx18 = wo1.a;
                        pg2 pg2VarA1115 = f30.a(pg2Var4, qnHx18, g95.w);
                        float f110 = 2 * a;
                        pg2 pg2VarA1116 = c94.a(c94.a(pg2VarA1115.y(new lm4(f110, f110, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list18, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                        vo1 vo1Var18 = y31.a;
                        ci2 ci2Var113 = ci2Var4;
                        int i2111113 = i16;
                        rt<Float> rtVar113 = rtVar4;
                        boolean z1111111110 = z4;
                        ne.a(f30.a(pg2VarA1116, qnHx18, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list18, sm4Var2, ri2VarF17, h81Var3)), j30VarQ, 3072, 6);
                        pg2Var5 = pg2Var4;
                        h81Var4 = h81Var3;
                        sm4Var3 = sm4Var2;
                        z6 = z1111111110;
                        i20 = i2111113;
                        ci2Var5 = ci2Var113;
                        rtVar5 = rtVar113;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
                }
                i4 |= 1572864;
                h81Var2 = h81Var;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (j30VarQ.I(ci2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var1114 = sv.a;
                            long jG1111117 = ((rv) j30VarQ.E(lg3Var1114)).g();
                            boolean z1111111111 = z2;
                            long jL1114 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1114)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1114)).k());
                            long jG1111118 = ((rv) j30VarQ.E(lg3Var1114)).g();
                            long jB11111111111113 = yu.b(jG1111118, 0.24f);
                            long jB11111111111114 = yu.b(((rv) j30VarQ.E(lg3Var1114)).f(), 0.32f);
                            long jB11111111111115 = yu.b(jB11111111111114, 0.12f);
                            int i2111114 = i8;
                            long jB11111111111116 = yu.b(sv.b(jG1111118, j30VarQ), 0.54f);
                            vh0 vh0Var1114 = new vh0(jG1111117, jL1114, jG1111118, jB11111111111113, jB11111111111114, jB11111111111115, jB11111111111116, yu.b(jG1111118, 0.54f), yu.b(jB11111111111116, 0.12f), yu.b(jB11111111111115, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111111;
                            rtVar4 = ptVar;
                            i16 = i2111114;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var1114;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111111112 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111111112;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var1115 = sv.a;
                            long jG1111119 = ((rv) j30VarQ.E(lg3Var1115)).g();
                            boolean z1111111113 = z2;
                            long jL1115 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1115)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1115)).k());
                            long jG11111110 = ((rv) j30VarQ.E(lg3Var1115)).g();
                            long jB11111111111117 = yu.b(jG11111110, 0.24f);
                            long jB11111111111118 = yu.b(((rv) j30VarQ.E(lg3Var1115)).f(), 0.32f);
                            long jB11111111111119 = yu.b(jB11111111111118, 0.12f);
                            int i2111115 = i8;
                            long jB111111111111110 = yu.b(sv.b(jG11111110, j30VarQ), 0.54f);
                            vh0 vh0Var1115 = new vh0(jG1111119, jL1115, jG11111110, jB11111111111117, jB11111111111118, jB11111111111119, jB111111111111110, yu.b(jG11111110, 0.54f), yu.b(jB111111111111110, 0.12f), yu.b(jB11111111111119, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111113;
                            rtVar4 = ptVar;
                            i16 = i2111115;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var1115;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111111114 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111111114;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF18 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf19 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf19);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list19 = (List) obj2;
                    jt4 jt4Var19 = f95.a;
                    wo1.QnHx qnHx19 = wo1.a;
                    pg2 pg2VarA1117 = f30.a(pg2Var4, qnHx19, g95.w);
                    float f111 = 2 * a;
                    pg2 pg2VarA1118 = c94.a(c94.a(pg2VarA1117.y(new lm4(f111, f111, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list19, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var19 = y31.a;
                    ci2 ci2Var114 = ci2Var4;
                    int i2111116 = i16;
                    rt<Float> rtVar114 = rtVar4;
                    boolean z1111111115 = z4;
                    ne.a(f30.a(pg2VarA1118, qnHx19, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list19, sm4Var2, ri2VarF18, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z1111111115;
                    i20 = i2111116;
                    ci2Var5 = ci2Var114;
                    rtVar5 = rtVar114;
                } else {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var1116 = sv.a;
                            long jG11111111 = ((rv) j30VarQ.E(lg3Var1116)).g();
                            boolean z1111111116 = z2;
                            long jL1116 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1116)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1116)).k());
                            long jG11111112 = ((rv) j30VarQ.E(lg3Var1116)).g();
                            long jB111111111111111 = yu.b(jG11111112, 0.24f);
                            long jB111111111111112 = yu.b(((rv) j30VarQ.E(lg3Var1116)).f(), 0.32f);
                            long jB111111111111113 = yu.b(jB111111111111112, 0.12f);
                            int i2111117 = i8;
                            long jB111111111111114 = yu.b(sv.b(jG11111112, j30VarQ), 0.54f);
                            vh0 vh0Var1116 = new vh0(jG11111111, jL1116, jG11111112, jB111111111111111, jB111111111111112, jB111111111111113, jB111111111111114, yu.b(jG11111112, 0.54f), yu.b(jB111111111111114, 0.12f), yu.b(jB111111111111113, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111116;
                            rtVar4 = ptVar;
                            i16 = i2111117;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var1116;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111111117 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111111117;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var1117 = sv.a;
                            long jG11111113 = ((rv) j30VarQ.E(lg3Var1117)).g();
                            boolean z1111111118 = z2;
                            long jL1117 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1117)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1117)).k());
                            long jG11111114 = ((rv) j30VarQ.E(lg3Var1117)).g();
                            long jB111111111111115 = yu.b(jG11111114, 0.24f);
                            long jB111111111111116 = yu.b(((rv) j30VarQ.E(lg3Var1117)).f(), 0.32f);
                            long jB111111111111117 = yu.b(jB111111111111116, 0.12f);
                            int i2111118 = i8;
                            long jB111111111111118 = yu.b(sv.b(jG11111114, j30VarQ), 0.54f);
                            vh0 vh0Var1117 = new vh0(jG11111113, jL1117, jG11111114, jB111111111111115, jB111111111111116, jB111111111111117, jB111111111111118, yu.b(jG11111114, 0.54f), yu.b(jB111111111111118, 0.12f), yu.b(jB111111111111117, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111118;
                            rtVar4 = ptVar;
                            i16 = i2111118;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var1117;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111111119 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111111119;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF19 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf110 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf110);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list110 = (List) obj2;
                    jt4 jt4Var110 = f95.a;
                    wo1.QnHx qnHx110 = wo1.a;
                    pg2 pg2VarA1119 = f30.a(pg2Var4, qnHx110, g95.w);
                    float f112 = 2 * a;
                    pg2 pg2VarA11110 = c94.a(c94.a(pg2VarA1119.y(new lm4(f112, f112, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list110, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var110 = y31.a;
                    ci2 ci2Var115 = ci2Var4;
                    int i2111119 = i16;
                    rt<Float> rtVar115 = rtVar4;
                    boolean z11111111110 = z4;
                    ne.a(f30.a(pg2VarA11110, qnHx110, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list110, sm4Var2, ri2VarF19, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z11111111110;
                    i20 = i2111119;
                    ci2Var5 = ci2Var115;
                    rtVar5 = rtVar115;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
            }
            i4 |= 196608;
            i8 = i;
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (j30VarQ.I(ci2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var1118 = sv.a;
                            long jG11111115 = ((rv) j30VarQ.E(lg3Var1118)).g();
                            boolean z11111111111 = z2;
                            long jL1118 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1118)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1118)).k());
                            long jG11111116 = ((rv) j30VarQ.E(lg3Var1118)).g();
                            long jB111111111111119 = yu.b(jG11111116, 0.24f);
                            long jB1111111111111110 = yu.b(((rv) j30VarQ.E(lg3Var1118)).f(), 0.32f);
                            long jB1111111111111111 = yu.b(jB1111111111111110, 0.12f);
                            int i21111110 = i8;
                            long jB1111111111111112 = yu.b(sv.b(jG11111116, j30VarQ), 0.54f);
                            vh0 vh0Var1118 = new vh0(jG11111115, jL1118, jG11111116, jB111111111111119, jB1111111111111110, jB1111111111111111, jB1111111111111112, yu.b(jG11111116, 0.54f), yu.b(jB1111111111111112, 0.12f), yu.b(jB1111111111111111, 0.12f));
                            j30VarQ.R(false);
                            z4 = z11111111111;
                            rtVar4 = ptVar;
                            i16 = i21111110;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var1118;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z11111111112 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z11111111112;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var1119 = sv.a;
                            long jG11111117 = ((rv) j30VarQ.E(lg3Var1119)).g();
                            boolean z11111111113 = z2;
                            long jL1119 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1119)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1119)).k());
                            long jG11111118 = ((rv) j30VarQ.E(lg3Var1119)).g();
                            long jB1111111111111113 = yu.b(jG11111118, 0.24f);
                            long jB1111111111111114 = yu.b(((rv) j30VarQ.E(lg3Var1119)).f(), 0.32f);
                            long jB1111111111111115 = yu.b(jB1111111111111114, 0.12f);
                            int i21111111 = i8;
                            long jB1111111111111116 = yu.b(sv.b(jG11111118, j30VarQ), 0.54f);
                            vh0 vh0Var1119 = new vh0(jG11111117, jL1119, jG11111118, jB1111111111111113, jB1111111111111114, jB1111111111111115, jB1111111111111116, yu.b(jG11111118, 0.54f), yu.b(jB1111111111111116, 0.12f), yu.b(jB1111111111111115, 0.12f));
                            j30VarQ.R(false);
                            z4 = z11111111113;
                            rtVar4 = ptVar;
                            i16 = i21111111;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var1119;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z11111111114 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z11111111114;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF110 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf111 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf111);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list111 = (List) obj2;
                    jt4 jt4Var111 = f95.a;
                    wo1.QnHx qnHx111 = wo1.a;
                    pg2 pg2VarA11111 = f30.a(pg2Var4, qnHx111, g95.w);
                    float f113 = 2 * a;
                    pg2 pg2VarA11112 = c94.a(c94.a(pg2VarA11111.y(new lm4(f113, f113, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list111, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var111 = y31.a;
                    ci2 ci2Var116 = ci2Var4;
                    int i21111112 = i16;
                    rt<Float> rtVar116 = rtVar4;
                    boolean z11111111115 = z4;
                    ne.a(f30.a(pg2VarA11112, qnHx111, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list111, sm4Var2, ri2VarF110, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z11111111115;
                    i20 = i21111112;
                    ci2Var5 = ci2Var116;
                    rtVar5 = rtVar116;
                } else {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var11110 = sv.a;
                            long jG11111119 = ((rv) j30VarQ.E(lg3Var11110)).g();
                            boolean z11111111116 = z2;
                            long jL11110 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11110)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11110)).k());
                            long jG111111110 = ((rv) j30VarQ.E(lg3Var11110)).g();
                            long jB1111111111111117 = yu.b(jG111111110, 0.24f);
                            long jB1111111111111118 = yu.b(((rv) j30VarQ.E(lg3Var11110)).f(), 0.32f);
                            long jB1111111111111119 = yu.b(jB1111111111111118, 0.12f);
                            int i21111113 = i8;
                            long jB11111111111111110 = yu.b(sv.b(jG111111110, j30VarQ), 0.54f);
                            vh0 vh0Var11110 = new vh0(jG11111119, jL11110, jG111111110, jB1111111111111117, jB1111111111111118, jB1111111111111119, jB11111111111111110, yu.b(jG111111110, 0.54f), yu.b(jB11111111111111110, 0.12f), yu.b(jB1111111111111119, 0.12f));
                            j30VarQ.R(false);
                            z4 = z11111111116;
                            rtVar4 = ptVar;
                            i16 = i21111113;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var11110;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z11111111117 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z11111111117;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var11111 = sv.a;
                            long jG111111111 = ((rv) j30VarQ.E(lg3Var11111)).g();
                            boolean z11111111118 = z2;
                            long jL11111 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11111)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11111)).k());
                            long jG111111112 = ((rv) j30VarQ.E(lg3Var11111)).g();
                            long jB11111111111111111 = yu.b(jG111111112, 0.24f);
                            long jB11111111111111112 = yu.b(((rv) j30VarQ.E(lg3Var11111)).f(), 0.32f);
                            long jB11111111111111113 = yu.b(jB11111111111111112, 0.12f);
                            int i21111114 = i8;
                            long jB11111111111111114 = yu.b(sv.b(jG111111112, j30VarQ), 0.54f);
                            vh0 vh0Var11111 = new vh0(jG111111111, jL11111, jG111111112, jB11111111111111111, jB11111111111111112, jB11111111111111113, jB11111111111111114, yu.b(jG111111112, 0.54f), yu.b(jB11111111111111114, 0.12f), yu.b(jB11111111111111113, 0.12f));
                            j30VarQ.R(false);
                            z4 = z11111111118;
                            rtVar4 = ptVar;
                            i16 = i21111114;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var11111;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z11111111119 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z11111111119;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF111 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf112 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf112);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list112 = (List) obj2;
                    jt4 jt4Var112 = f95.a;
                    wo1.QnHx qnHx112 = wo1.a;
                    pg2 pg2VarA11113 = f30.a(pg2Var4, qnHx112, g95.w);
                    float f114 = 2 * a;
                    pg2 pg2VarA11114 = c94.a(c94.a(pg2VarA11113.y(new lm4(f114, f114, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list112, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var112 = y31.a;
                    ci2 ci2Var117 = ci2Var4;
                    int i21111115 = i16;
                    rt<Float> rtVar117 = rtVar4;
                    boolean z111111111110 = z4;
                    ne.a(f30.a(pg2VarA11114, qnHx112, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list112, sm4Var2, ri2VarF111, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z111111111110;
                    i20 = i21111115;
                    ci2Var5 = ci2Var117;
                    rtVar5 = rtVar117;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
            }
            i4 |= 1572864;
            h81Var2 = h81Var;
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (j30VarQ.I(ci2Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
            }
            if ((i4 & 191739611) == 38347922) {
                j30VarQ.t0();
                i14 = i2 & 1;
                obj = g30.QnHx.a;
                if (i14 != 0) {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var11112 = sv.a;
                        long jG111111113 = ((rv) j30VarQ.E(lg3Var11112)).g();
                        boolean z111111111111 = z2;
                        long jL11112 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11112)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11112)).k());
                        long jG111111114 = ((rv) j30VarQ.E(lg3Var11112)).g();
                        long jB11111111111111115 = yu.b(jG111111114, 0.24f);
                        long jB11111111111111116 = yu.b(((rv) j30VarQ.E(lg3Var11112)).f(), 0.32f);
                        long jB11111111111111117 = yu.b(jB11111111111111116, 0.12f);
                        int i21111116 = i8;
                        long jB11111111111111118 = yu.b(sv.b(jG111111114, j30VarQ), 0.54f);
                        vh0 vh0Var11112 = new vh0(jG111111113, jL11112, jG111111114, jB11111111111111115, jB11111111111111116, jB11111111111111117, jB11111111111111118, yu.b(jG111111114, 0.54f), yu.b(jB11111111111111118, 0.12f), yu.b(jB11111111111111117, 0.12f));
                        j30VarQ.R(false);
                        z4 = z111111111111;
                        rtVar4 = ptVar;
                        i16 = i21111116;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var11112;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z111111111112 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z111111111112;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                } else {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var11113 = sv.a;
                        long jG111111115 = ((rv) j30VarQ.E(lg3Var11113)).g();
                        boolean z111111111113 = z2;
                        long jL11113 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11113)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11113)).k());
                        long jG111111116 = ((rv) j30VarQ.E(lg3Var11113)).g();
                        long jB11111111111111119 = yu.b(jG111111116, 0.24f);
                        long jB111111111111111110 = yu.b(((rv) j30VarQ.E(lg3Var11113)).f(), 0.32f);
                        long jB111111111111111111 = yu.b(jB111111111111111110, 0.12f);
                        int i21111117 = i8;
                        long jB111111111111111112 = yu.b(sv.b(jG111111116, j30VarQ), 0.54f);
                        vh0 vh0Var11113 = new vh0(jG111111115, jL11113, jG111111116, jB11111111111111119, jB111111111111111110, jB111111111111111111, jB111111111111111112, yu.b(jG111111116, 0.54f), yu.b(jB111111111111111112, 0.12f), yu.b(jB111111111111111111, 0.12f));
                        j30VarQ.R(false);
                        z4 = z111111111113;
                        rtVar4 = ptVar;
                        i16 = i21111117;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var11113;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z111111111114 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z111111111114;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                }
                j30VarQ.S();
                if (i16 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                ri2 ri2VarF112 = ps0.f0(j81Var, j30VarQ);
                Object objValueOf113 = Integer.valueOf(i16);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(objValueOf113);
                objB1 = j30VarQ.b0();
                if (zI) {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                }
                j30VarQ.R(false);
                List list113 = (List) obj2;
                jt4 jt4Var113 = f95.a;
                wo1.QnHx qnHx113 = wo1.a;
                pg2 pg2VarA11115 = f30.a(pg2Var4, qnHx113, g95.w);
                float f115 = 2 * a;
                pg2 pg2VarA11116 = c94.a(c94.a(pg2VarA11115.y(new lm4(f115, f115, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list113, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                vo1 vo1Var113 = y31.a;
                ci2 ci2Var118 = ci2Var4;
                int i21111118 = i16;
                rt<Float> rtVar118 = rtVar4;
                boolean z111111111115 = z4;
                ne.a(f30.a(pg2VarA11116, qnHx113, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list113, sm4Var2, ri2VarF112, h81Var3)), j30VarQ, 3072, 6);
                pg2Var5 = pg2Var4;
                h81Var4 = h81Var3;
                sm4Var3 = sm4Var2;
                z6 = z111111111115;
                i20 = i21111118;
                ci2Var5 = ci2Var118;
                rtVar5 = rtVar118;
            } else {
                j30VarQ.t0();
                i14 = i2 & 1;
                obj = g30.QnHx.a;
                if (i14 != 0) {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var11114 = sv.a;
                        long jG111111117 = ((rv) j30VarQ.E(lg3Var11114)).g();
                        boolean z111111111116 = z2;
                        long jL11114 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11114)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11114)).k());
                        long jG111111118 = ((rv) j30VarQ.E(lg3Var11114)).g();
                        long jB111111111111111113 = yu.b(jG111111118, 0.24f);
                        long jB111111111111111114 = yu.b(((rv) j30VarQ.E(lg3Var11114)).f(), 0.32f);
                        long jB111111111111111115 = yu.b(jB111111111111111114, 0.12f);
                        int i21111119 = i8;
                        long jB111111111111111116 = yu.b(sv.b(jG111111118, j30VarQ), 0.54f);
                        vh0 vh0Var11114 = new vh0(jG111111117, jL11114, jG111111118, jB111111111111111113, jB111111111111111114, jB111111111111111115, jB111111111111111116, yu.b(jG111111118, 0.54f), yu.b(jB111111111111111116, 0.12f), yu.b(jB111111111111111115, 0.12f));
                        j30VarQ.R(false);
                        z4 = z111111111116;
                        rtVar4 = ptVar;
                        i16 = i21111119;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var11114;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z111111111117 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z111111111117;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                } else {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var11115 = sv.a;
                        long jG111111119 = ((rv) j30VarQ.E(lg3Var11115)).g();
                        boolean z111111111118 = z2;
                        long jL11115 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11115)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11115)).k());
                        long jG1111111110 = ((rv) j30VarQ.E(lg3Var11115)).g();
                        long jB111111111111111117 = yu.b(jG1111111110, 0.24f);
                        long jB111111111111111118 = yu.b(((rv) j30VarQ.E(lg3Var11115)).f(), 0.32f);
                        long jB111111111111111119 = yu.b(jB111111111111111118, 0.12f);
                        int i211111110 = i8;
                        long jB1111111111111111110 = yu.b(sv.b(jG1111111110, j30VarQ), 0.54f);
                        vh0 vh0Var11115 = new vh0(jG111111119, jL11115, jG1111111110, jB111111111111111117, jB111111111111111118, jB111111111111111119, jB1111111111111111110, yu.b(jG1111111110, 0.54f), yu.b(jB1111111111111111110, 0.12f), yu.b(jB111111111111111119, 0.12f));
                        j30VarQ.R(false);
                        z4 = z111111111118;
                        rtVar4 = ptVar;
                        i16 = i211111110;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var11115;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z111111111119 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z111111111119;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                }
                j30VarQ.S();
                if (i16 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                ri2 ri2VarF113 = ps0.f0(j81Var, j30VarQ);
                Object objValueOf114 = Integer.valueOf(i16);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(objValueOf114);
                objB1 = j30VarQ.b0();
                if (zI) {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                }
                j30VarQ.R(false);
                List list114 = (List) obj2;
                jt4 jt4Var114 = f95.a;
                wo1.QnHx qnHx114 = wo1.a;
                pg2 pg2VarA11117 = f30.a(pg2Var4, qnHx114, g95.w);
                float f116 = 2 * a;
                pg2 pg2VarA11118 = c94.a(c94.a(pg2VarA11117.y(new lm4(f116, f116, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list114, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                vo1 vo1Var114 = y31.a;
                ci2 ci2Var119 = ci2Var4;
                int i211111111 = i16;
                rt<Float> rtVar119 = rtVar4;
                boolean z1111111111110 = z4;
                ne.a(f30.a(pg2VarA11118, qnHx114, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list114, sm4Var2, ri2VarF113, h81Var3)), j30VarQ, 3072, 6);
                pg2Var5 = pg2Var4;
                h81Var4 = h81Var3;
                sm4Var3 = sm4Var2;
                z6 = z1111111111110;
                i20 = i211111111;
                ci2Var5 = ci2Var119;
                rtVar5 = rtVar119;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
        }
        i4 |= 3072;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                rtVar2 = rtVar;
                if (j30VarQ.I(rtVar2)) {
                }
                i4 |= i22;
            } else {
                rtVar2 = rtVar;
            }
            i4 |= i22;
        } else {
            rtVar2 = rtVar;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                i8 = i;
                if (j30VarQ.i(i8)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((3670016 & i2) == 0) {
                    h81Var2 = h81Var;
                    if (j30VarQ.I(h81Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (j30VarQ.I(ci2Var)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
                }
                if ((i4 & 191739611) == 38347922) {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var11116 = sv.a;
                            long jG1111111111 = ((rv) j30VarQ.E(lg3Var11116)).g();
                            boolean z1111111111111 = z2;
                            long jL11116 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11116)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11116)).k());
                            long jG1111111112 = ((rv) j30VarQ.E(lg3Var11116)).g();
                            long jB1111111111111111111 = yu.b(jG1111111112, 0.24f);
                            long jB1111111111111111112 = yu.b(((rv) j30VarQ.E(lg3Var11116)).f(), 0.32f);
                            long jB1111111111111111113 = yu.b(jB1111111111111111112, 0.12f);
                            int i211111112 = i8;
                            long jB1111111111111111114 = yu.b(sv.b(jG1111111112, j30VarQ), 0.54f);
                            vh0 vh0Var11116 = new vh0(jG1111111111, jL11116, jG1111111112, jB1111111111111111111, jB1111111111111111112, jB1111111111111111113, jB1111111111111111114, yu.b(jG1111111112, 0.54f), yu.b(jB1111111111111111114, 0.12f), yu.b(jB1111111111111111113, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111111111;
                            rtVar4 = ptVar;
                            i16 = i211111112;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var11116;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111111111112 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111111111112;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var11117 = sv.a;
                            long jG1111111113 = ((rv) j30VarQ.E(lg3Var11117)).g();
                            boolean z1111111111113 = z2;
                            long jL11117 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11117)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11117)).k());
                            long jG1111111114 = ((rv) j30VarQ.E(lg3Var11117)).g();
                            long jB1111111111111111115 = yu.b(jG1111111114, 0.24f);
                            long jB1111111111111111116 = yu.b(((rv) j30VarQ.E(lg3Var11117)).f(), 0.32f);
                            long jB1111111111111111117 = yu.b(jB1111111111111111116, 0.12f);
                            int i211111113 = i8;
                            long jB1111111111111111118 = yu.b(sv.b(jG1111111114, j30VarQ), 0.54f);
                            vh0 vh0Var11117 = new vh0(jG1111111113, jL11117, jG1111111114, jB1111111111111111115, jB1111111111111111116, jB1111111111111111117, jB1111111111111111118, yu.b(jG1111111114, 0.54f), yu.b(jB1111111111111111118, 0.12f), yu.b(jB1111111111111111117, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111111113;
                            rtVar4 = ptVar;
                            i16 = i211111113;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var11117;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111111111114 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111111111114;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF114 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf115 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf115);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list115 = (List) obj2;
                    jt4 jt4Var115 = f95.a;
                    wo1.QnHx qnHx115 = wo1.a;
                    pg2 pg2VarA11119 = f30.a(pg2Var4, qnHx115, g95.w);
                    float f117 = 2 * a;
                    pg2 pg2VarA111110 = c94.a(c94.a(pg2VarA11119.y(new lm4(f117, f117, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list115, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var115 = y31.a;
                    ci2 ci2Var1110 = ci2Var4;
                    int i211111114 = i16;
                    rt<Float> rtVar1110 = rtVar4;
                    boolean z1111111111115 = z4;
                    ne.a(f30.a(pg2VarA111110, qnHx115, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list115, sm4Var2, ri2VarF114, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z1111111111115;
                    i20 = i211111114;
                    ci2Var5 = ci2Var1110;
                    rtVar5 = rtVar1110;
                } else {
                    j30VarQ.t0();
                    i14 = i2 & 1;
                    obj = g30.QnHx.a;
                    if (i14 != 0) {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var11118 = sv.a;
                            long jG1111111115 = ((rv) j30VarQ.E(lg3Var11118)).g();
                            boolean z1111111111116 = z2;
                            long jL11118 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11118)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11118)).k());
                            long jG1111111116 = ((rv) j30VarQ.E(lg3Var11118)).g();
                            long jB1111111111111111119 = yu.b(jG1111111116, 0.24f);
                            long jB11111111111111111110 = yu.b(((rv) j30VarQ.E(lg3Var11118)).f(), 0.32f);
                            long jB11111111111111111111 = yu.b(jB11111111111111111110, 0.12f);
                            int i211111115 = i8;
                            long jB11111111111111111112 = yu.b(sv.b(jG1111111116, j30VarQ), 0.54f);
                            vh0 vh0Var11118 = new vh0(jG1111111115, jL11118, jG1111111116, jB1111111111111111119, jB11111111111111111110, jB11111111111111111111, jB11111111111111111112, yu.b(jG1111111116, 0.54f), yu.b(jB11111111111111111112, 0.12f), yu.b(jB11111111111111111111, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111111116;
                            rtVar4 = ptVar;
                            i16 = i211111115;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var11118;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111111111117 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111111111117;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    } else {
                        if (i21 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i3 & 16) != 0) {
                            ptVar = new pt(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            ptVar = rtVar;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        if (i10 != 0) {
                            h81Var2 = null;
                        }
                        if (i12 != 0) {
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            if (objB0 == obj) {
                                objB0 = new di2();
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ci2Var2 = (ci2) objB0;
                        } else {
                            ci2Var2 = ci2Var;
                        }
                        if ((i3 & 256) != 0) {
                            j30VarQ.e(436017687);
                            lg3 lg3Var11119 = sv.a;
                            long jG1111111117 = ((rv) j30VarQ.E(lg3Var11119)).g();
                            boolean z1111111111118 = z2;
                            long jL11119 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var11119)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var11119)).k());
                            long jG1111111118 = ((rv) j30VarQ.E(lg3Var11119)).g();
                            long jB11111111111111111113 = yu.b(jG1111111118, 0.24f);
                            long jB11111111111111111114 = yu.b(((rv) j30VarQ.E(lg3Var11119)).f(), 0.32f);
                            long jB11111111111111111115 = yu.b(jB11111111111111111114, 0.12f);
                            int i211111116 = i8;
                            long jB11111111111111111116 = yu.b(sv.b(jG1111111118, j30VarQ), 0.54f);
                            vh0 vh0Var11119 = new vh0(jG1111111117, jL11119, jG1111111118, jB11111111111111111113, jB11111111111111111114, jB11111111111111111115, jB11111111111111111116, yu.b(jG1111111118, 0.54f), yu.b(jB11111111111111111116, 0.12f), yu.b(jB11111111111111111115, 0.12f));
                            j30VarQ.R(false);
                            z4 = z1111111111118;
                            rtVar4 = ptVar;
                            i16 = i211111116;
                            ci2Var4 = ci2Var2;
                            sm4Var2 = vh0Var11119;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var2;
                            i17 = i4 & (-234881025);
                        } else {
                            boolean z1111111111119 = z2;
                            rtVar3 = ptVar;
                            i15 = i4;
                            ci2Var3 = ci2Var2;
                            pg2Var3 = pg2Var2;
                            z3 = z1111111111119;
                            sm4Var2 = sm4Var;
                            z4 = z3;
                            ci2Var4 = ci2Var3;
                            i16 = i8;
                            h81Var3 = h81Var2;
                            pg2Var4 = pg2Var3;
                            rtVar4 = rtVar3;
                            i17 = i15;
                        }
                    }
                    j30VarQ.S();
                    if (i16 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    ri2 ri2VarF115 = ps0.f0(j81Var, j30VarQ);
                    Object objValueOf116 = Integer.valueOf(i16);
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(objValueOf116);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i16 == 0) {
                            arrayList = cs0.w;
                        } else {
                            i18 = i16 + 2;
                            arrayList = new ArrayList(i18);
                            while (i19 < i18) {
                                arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                            }
                        }
                        j30VarQ.F0(arrayList);
                        obj2 = arrayList;
                    }
                    j30VarQ.R(false);
                    List list116 = (List) obj2;
                    jt4 jt4Var116 = f95.a;
                    wo1.QnHx qnHx116 = wo1.a;
                    pg2 pg2VarA111111 = f30.a(pg2Var4, qnHx116, g95.w);
                    float f118 = 2 * a;
                    pg2 pg2VarA111112 = c94.a(c94.a(pg2VarA111111.y(new lm4(f118, f118, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list116, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                    vo1 vo1Var116 = y31.a;
                    ci2 ci2Var1111 = ci2Var4;
                    int i211111117 = i16;
                    rt<Float> rtVar1111 = rtVar4;
                    boolean z11111111111110 = z4;
                    ne.a(f30.a(pg2VarA111112, qnHx116, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list116, sm4Var2, ri2VarF115, h81Var3)), j30VarQ, 3072, 6);
                    pg2Var5 = pg2Var4;
                    h81Var4 = h81Var3;
                    sm4Var3 = sm4Var2;
                    z6 = z11111111111110;
                    i20 = i211111117;
                    ci2Var5 = ci2Var1111;
                    rtVar5 = rtVar1111;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
            }
            i4 |= 1572864;
            h81Var2 = h81Var;
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (j30VarQ.I(ci2Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
            }
            if ((i4 & 191739611) == 38347922) {
                j30VarQ.t0();
                i14 = i2 & 1;
                obj = g30.QnHx.a;
                if (i14 != 0) {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var111110 = sv.a;
                        long jG1111111119 = ((rv) j30VarQ.E(lg3Var111110)).g();
                        boolean z11111111111111 = z2;
                        long jL111110 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111110)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111110)).k());
                        long jG11111111110 = ((rv) j30VarQ.E(lg3Var111110)).g();
                        long jB11111111111111111117 = yu.b(jG11111111110, 0.24f);
                        long jB11111111111111111118 = yu.b(((rv) j30VarQ.E(lg3Var111110)).f(), 0.32f);
                        long jB11111111111111111119 = yu.b(jB11111111111111111118, 0.12f);
                        int i211111118 = i8;
                        long jB111111111111111111110 = yu.b(sv.b(jG11111111110, j30VarQ), 0.54f);
                        vh0 vh0Var111110 = new vh0(jG1111111119, jL111110, jG11111111110, jB11111111111111111117, jB11111111111111111118, jB11111111111111111119, jB111111111111111111110, yu.b(jG11111111110, 0.54f), yu.b(jB111111111111111111110, 0.12f), yu.b(jB11111111111111111119, 0.12f));
                        j30VarQ.R(false);
                        z4 = z11111111111111;
                        rtVar4 = ptVar;
                        i16 = i211111118;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var111110;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z11111111111112 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z11111111111112;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                } else {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var111111 = sv.a;
                        long jG11111111111 = ((rv) j30VarQ.E(lg3Var111111)).g();
                        boolean z11111111111113 = z2;
                        long jL111111 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111111)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111111)).k());
                        long jG11111111112 = ((rv) j30VarQ.E(lg3Var111111)).g();
                        long jB111111111111111111111 = yu.b(jG11111111112, 0.24f);
                        long jB111111111111111111112 = yu.b(((rv) j30VarQ.E(lg3Var111111)).f(), 0.32f);
                        long jB111111111111111111113 = yu.b(jB111111111111111111112, 0.12f);
                        int i211111119 = i8;
                        long jB111111111111111111114 = yu.b(sv.b(jG11111111112, j30VarQ), 0.54f);
                        vh0 vh0Var111111 = new vh0(jG11111111111, jL111111, jG11111111112, jB111111111111111111111, jB111111111111111111112, jB111111111111111111113, jB111111111111111111114, yu.b(jG11111111112, 0.54f), yu.b(jB111111111111111111114, 0.12f), yu.b(jB111111111111111111113, 0.12f));
                        j30VarQ.R(false);
                        z4 = z11111111111113;
                        rtVar4 = ptVar;
                        i16 = i211111119;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var111111;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z11111111111114 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z11111111111114;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                }
                j30VarQ.S();
                if (i16 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                ri2 ri2VarF116 = ps0.f0(j81Var, j30VarQ);
                Object objValueOf117 = Integer.valueOf(i16);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(objValueOf117);
                objB1 = j30VarQ.b0();
                if (zI) {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                }
                j30VarQ.R(false);
                List list117 = (List) obj2;
                jt4 jt4Var117 = f95.a;
                wo1.QnHx qnHx117 = wo1.a;
                pg2 pg2VarA111113 = f30.a(pg2Var4, qnHx117, g95.w);
                float f119 = 2 * a;
                pg2 pg2VarA111114 = c94.a(c94.a(pg2VarA111113.y(new lm4(f119, f119, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list117, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                vo1 vo1Var117 = y31.a;
                ci2 ci2Var1112 = ci2Var4;
                int i2111111110 = i16;
                rt<Float> rtVar1112 = rtVar4;
                boolean z11111111111115 = z4;
                ne.a(f30.a(pg2VarA111114, qnHx117, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list117, sm4Var2, ri2VarF116, h81Var3)), j30VarQ, 3072, 6);
                pg2Var5 = pg2Var4;
                h81Var4 = h81Var3;
                sm4Var3 = sm4Var2;
                z6 = z11111111111115;
                i20 = i2111111110;
                ci2Var5 = ci2Var1112;
                rtVar5 = rtVar1112;
            } else {
                j30VarQ.t0();
                i14 = i2 & 1;
                obj = g30.QnHx.a;
                if (i14 != 0) {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var111112 = sv.a;
                        long jG11111111113 = ((rv) j30VarQ.E(lg3Var111112)).g();
                        boolean z11111111111116 = z2;
                        long jL111112 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111112)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111112)).k());
                        long jG11111111114 = ((rv) j30VarQ.E(lg3Var111112)).g();
                        long jB111111111111111111115 = yu.b(jG11111111114, 0.24f);
                        long jB111111111111111111116 = yu.b(((rv) j30VarQ.E(lg3Var111112)).f(), 0.32f);
                        long jB111111111111111111117 = yu.b(jB111111111111111111116, 0.12f);
                        int i2111111111 = i8;
                        long jB111111111111111111118 = yu.b(sv.b(jG11111111114, j30VarQ), 0.54f);
                        vh0 vh0Var111112 = new vh0(jG11111111113, jL111112, jG11111111114, jB111111111111111111115, jB111111111111111111116, jB111111111111111111117, jB111111111111111111118, yu.b(jG11111111114, 0.54f), yu.b(jB111111111111111111118, 0.12f), yu.b(jB111111111111111111117, 0.12f));
                        j30VarQ.R(false);
                        z4 = z11111111111116;
                        rtVar4 = ptVar;
                        i16 = i2111111111;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var111112;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z11111111111117 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z11111111111117;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                } else {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var111113 = sv.a;
                        long jG11111111115 = ((rv) j30VarQ.E(lg3Var111113)).g();
                        boolean z11111111111118 = z2;
                        long jL111113 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111113)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111113)).k());
                        long jG11111111116 = ((rv) j30VarQ.E(lg3Var111113)).g();
                        long jB111111111111111111119 = yu.b(jG11111111116, 0.24f);
                        long jB1111111111111111111110 = yu.b(((rv) j30VarQ.E(lg3Var111113)).f(), 0.32f);
                        long jB1111111111111111111111 = yu.b(jB1111111111111111111110, 0.12f);
                        int i2111111112 = i8;
                        long jB1111111111111111111112 = yu.b(sv.b(jG11111111116, j30VarQ), 0.54f);
                        vh0 vh0Var111113 = new vh0(jG11111111115, jL111113, jG11111111116, jB111111111111111111119, jB1111111111111111111110, jB1111111111111111111111, jB1111111111111111111112, yu.b(jG11111111116, 0.54f), yu.b(jB1111111111111111111112, 0.12f), yu.b(jB1111111111111111111111, 0.12f));
                        j30VarQ.R(false);
                        z4 = z11111111111118;
                        rtVar4 = ptVar;
                        i16 = i2111111112;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var111113;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z11111111111119 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z11111111111119;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                }
                j30VarQ.S();
                if (i16 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                ri2 ri2VarF117 = ps0.f0(j81Var, j30VarQ);
                Object objValueOf118 = Integer.valueOf(i16);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(objValueOf118);
                objB1 = j30VarQ.b0();
                if (zI) {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                }
                j30VarQ.R(false);
                List list118 = (List) obj2;
                jt4 jt4Var118 = f95.a;
                wo1.QnHx qnHx118 = wo1.a;
                pg2 pg2VarA111115 = f30.a(pg2Var4, qnHx118, g95.w);
                float f1110 = 2 * a;
                pg2 pg2VarA111116 = c94.a(c94.a(pg2VarA111115.y(new lm4(f1110, f1110, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list118, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                vo1 vo1Var118 = y31.a;
                ci2 ci2Var1113 = ci2Var4;
                int i2111111113 = i16;
                rt<Float> rtVar1113 = rtVar4;
                boolean z111111111111110 = z4;
                ne.a(f30.a(pg2VarA111116, qnHx118, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list118, sm4Var2, ri2VarF117, h81Var3)), j30VarQ, 3072, 6);
                pg2Var5 = pg2Var4;
                h81Var4 = h81Var3;
                sm4Var3 = sm4Var2;
                z6 = z111111111111110;
                i20 = i2111111113;
                ci2Var5 = ci2Var1113;
                rtVar5 = rtVar1113;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
        }
        i4 |= 196608;
        i8 = i;
        i10 = i3 & 64;
        if (i10 != 0) {
            if ((3670016 & i2) == 0) {
                h81Var2 = h81Var;
                if (j30VarQ.I(h81Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (j30VarQ.I(ci2Var)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
            }
            if ((i4 & 191739611) == 38347922) {
                j30VarQ.t0();
                i14 = i2 & 1;
                obj = g30.QnHx.a;
                if (i14 != 0) {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var111114 = sv.a;
                        long jG11111111117 = ((rv) j30VarQ.E(lg3Var111114)).g();
                        boolean z111111111111111 = z2;
                        long jL111114 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111114)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111114)).k());
                        long jG11111111118 = ((rv) j30VarQ.E(lg3Var111114)).g();
                        long jB1111111111111111111113 = yu.b(jG11111111118, 0.24f);
                        long jB1111111111111111111114 = yu.b(((rv) j30VarQ.E(lg3Var111114)).f(), 0.32f);
                        long jB1111111111111111111115 = yu.b(jB1111111111111111111114, 0.12f);
                        int i2111111114 = i8;
                        long jB1111111111111111111116 = yu.b(sv.b(jG11111111118, j30VarQ), 0.54f);
                        vh0 vh0Var111114 = new vh0(jG11111111117, jL111114, jG11111111118, jB1111111111111111111113, jB1111111111111111111114, jB1111111111111111111115, jB1111111111111111111116, yu.b(jG11111111118, 0.54f), yu.b(jB1111111111111111111116, 0.12f), yu.b(jB1111111111111111111115, 0.12f));
                        j30VarQ.R(false);
                        z4 = z111111111111111;
                        rtVar4 = ptVar;
                        i16 = i2111111114;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var111114;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z111111111111112 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z111111111111112;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                } else {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var111115 = sv.a;
                        long jG11111111119 = ((rv) j30VarQ.E(lg3Var111115)).g();
                        boolean z111111111111113 = z2;
                        long jL111115 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111115)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111115)).k());
                        long jG111111111110 = ((rv) j30VarQ.E(lg3Var111115)).g();
                        long jB1111111111111111111117 = yu.b(jG111111111110, 0.24f);
                        long jB1111111111111111111118 = yu.b(((rv) j30VarQ.E(lg3Var111115)).f(), 0.32f);
                        long jB1111111111111111111119 = yu.b(jB1111111111111111111118, 0.12f);
                        int i2111111115 = i8;
                        long jB11111111111111111111110 = yu.b(sv.b(jG111111111110, j30VarQ), 0.54f);
                        vh0 vh0Var111115 = new vh0(jG11111111119, jL111115, jG111111111110, jB1111111111111111111117, jB1111111111111111111118, jB1111111111111111111119, jB11111111111111111111110, yu.b(jG111111111110, 0.54f), yu.b(jB11111111111111111111110, 0.12f), yu.b(jB1111111111111111111119, 0.12f));
                        j30VarQ.R(false);
                        z4 = z111111111111113;
                        rtVar4 = ptVar;
                        i16 = i2111111115;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var111115;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z111111111111114 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z111111111111114;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                }
                j30VarQ.S();
                if (i16 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                ri2 ri2VarF118 = ps0.f0(j81Var, j30VarQ);
                Object objValueOf119 = Integer.valueOf(i16);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(objValueOf119);
                objB1 = j30VarQ.b0();
                if (zI) {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                }
                j30VarQ.R(false);
                List list119 = (List) obj2;
                jt4 jt4Var119 = f95.a;
                wo1.QnHx qnHx119 = wo1.a;
                pg2 pg2VarA111117 = f30.a(pg2Var4, qnHx119, g95.w);
                float f1111 = 2 * a;
                pg2 pg2VarA111118 = c94.a(c94.a(pg2VarA111117.y(new lm4(f1111, f1111, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list119, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                vo1 vo1Var119 = y31.a;
                ci2 ci2Var1114 = ci2Var4;
                int i2111111116 = i16;
                rt<Float> rtVar1114 = rtVar4;
                boolean z111111111111115 = z4;
                ne.a(f30.a(pg2VarA111118, qnHx119, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list119, sm4Var2, ri2VarF118, h81Var3)), j30VarQ, 3072, 6);
                pg2Var5 = pg2Var4;
                h81Var4 = h81Var3;
                sm4Var3 = sm4Var2;
                z6 = z111111111111115;
                i20 = i2111111116;
                ci2Var5 = ci2Var1114;
                rtVar5 = rtVar1114;
            } else {
                j30VarQ.t0();
                i14 = i2 & 1;
                obj = g30.QnHx.a;
                if (i14 != 0) {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var111116 = sv.a;
                        long jG111111111111 = ((rv) j30VarQ.E(lg3Var111116)).g();
                        boolean z111111111111116 = z2;
                        long jL111116 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111116)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111116)).k());
                        long jG111111111112 = ((rv) j30VarQ.E(lg3Var111116)).g();
                        long jB11111111111111111111111 = yu.b(jG111111111112, 0.24f);
                        long jB11111111111111111111112 = yu.b(((rv) j30VarQ.E(lg3Var111116)).f(), 0.32f);
                        long jB11111111111111111111113 = yu.b(jB11111111111111111111112, 0.12f);
                        int i2111111117 = i8;
                        long jB11111111111111111111114 = yu.b(sv.b(jG111111111112, j30VarQ), 0.54f);
                        vh0 vh0Var111116 = new vh0(jG111111111111, jL111116, jG111111111112, jB11111111111111111111111, jB11111111111111111111112, jB11111111111111111111113, jB11111111111111111111114, yu.b(jG111111111112, 0.54f), yu.b(jB11111111111111111111114, 0.12f), yu.b(jB11111111111111111111113, 0.12f));
                        j30VarQ.R(false);
                        z4 = z111111111111116;
                        rtVar4 = ptVar;
                        i16 = i2111111117;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var111116;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z111111111111117 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z111111111111117;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                } else {
                    if (i21 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i3 & 16) != 0) {
                        ptVar = new pt(0.0f, 1.0f);
                        i4 &= -57345;
                    } else {
                        ptVar = rtVar;
                    }
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (i10 != 0) {
                        h81Var2 = null;
                    }
                    if (i12 != 0) {
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        if (objB0 == obj) {
                            objB0 = new di2();
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ci2Var2 = (ci2) objB0;
                    } else {
                        ci2Var2 = ci2Var;
                    }
                    if ((i3 & 256) != 0) {
                        j30VarQ.e(436017687);
                        lg3 lg3Var111117 = sv.a;
                        long jG111111111113 = ((rv) j30VarQ.E(lg3Var111117)).g();
                        boolean z111111111111118 = z2;
                        long jL111117 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111117)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111117)).k());
                        long jG111111111114 = ((rv) j30VarQ.E(lg3Var111117)).g();
                        long jB11111111111111111111115 = yu.b(jG111111111114, 0.24f);
                        long jB11111111111111111111116 = yu.b(((rv) j30VarQ.E(lg3Var111117)).f(), 0.32f);
                        long jB11111111111111111111117 = yu.b(jB11111111111111111111116, 0.12f);
                        int i2111111118 = i8;
                        long jB11111111111111111111118 = yu.b(sv.b(jG111111111114, j30VarQ), 0.54f);
                        vh0 vh0Var111117 = new vh0(jG111111111113, jL111117, jG111111111114, jB11111111111111111111115, jB11111111111111111111116, jB11111111111111111111117, jB11111111111111111111118, yu.b(jG111111111114, 0.54f), yu.b(jB11111111111111111111118, 0.12f), yu.b(jB11111111111111111111117, 0.12f));
                        j30VarQ.R(false);
                        z4 = z111111111111118;
                        rtVar4 = ptVar;
                        i16 = i2111111118;
                        ci2Var4 = ci2Var2;
                        sm4Var2 = vh0Var111117;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var2;
                        i17 = i4 & (-234881025);
                    } else {
                        boolean z111111111111119 = z2;
                        rtVar3 = ptVar;
                        i15 = i4;
                        ci2Var3 = ci2Var2;
                        pg2Var3 = pg2Var2;
                        z3 = z111111111111119;
                        sm4Var2 = sm4Var;
                        z4 = z3;
                        ci2Var4 = ci2Var3;
                        i16 = i8;
                        h81Var3 = h81Var2;
                        pg2Var4 = pg2Var3;
                        rtVar4 = rtVar3;
                        i17 = i15;
                    }
                }
                j30VarQ.S();
                if (i16 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                ri2 ri2VarF119 = ps0.f0(j81Var, j30VarQ);
                Object objValueOf1110 = Integer.valueOf(i16);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(objValueOf1110);
                objB1 = j30VarQ.b0();
                if (zI) {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i16 == 0) {
                        arrayList = cs0.w;
                    } else {
                        i18 = i16 + 2;
                        arrayList = new ArrayList(i18);
                        while (i19 < i18) {
                            arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                        }
                    }
                    j30VarQ.F0(arrayList);
                    obj2 = arrayList;
                }
                j30VarQ.R(false);
                List list1110 = (List) obj2;
                jt4 jt4Var1110 = f95.a;
                wo1.QnHx qnHx1110 = wo1.a;
                pg2 pg2VarA111119 = f30.a(pg2Var4, qnHx1110, g95.w);
                float f1112 = 2 * a;
                pg2 pg2VarA1111110 = c94.a(c94.a(pg2VarA111119.y(new lm4(f1112, f1112, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list1110, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
                vo1 vo1Var1110 = y31.a;
                ci2 ci2Var1115 = ci2Var4;
                int i2111111119 = i16;
                rt<Float> rtVar1115 = rtVar4;
                boolean z1111111111111110 = z4;
                ne.a(f30.a(pg2VarA1111110, qnHx1110, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list1110, sm4Var2, ri2VarF119, h81Var3)), j30VarQ, 3072, 6);
                pg2Var5 = pg2Var4;
                h81Var4 = h81Var3;
                sm4Var3 = sm4Var2;
                z6 = z1111111111111110;
                i20 = i2111111119;
                ci2Var5 = ci2Var1115;
                rtVar5 = rtVar1115;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
        }
        i4 |= 1572864;
        h81Var2 = h81Var;
        i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            if (j30VarQ.I(ci2Var)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i4 |= i13;
        }
        if ((i2 & 234881024) != 0) {
            i4 |= ((i3 & 256) == 0 || !j30VarQ.I(sm4Var)) ? 33554432 : 67108864;
        }
        if ((i4 & 191739611) == 38347922) {
            j30VarQ.t0();
            i14 = i2 & 1;
            obj = g30.QnHx.a;
            if (i14 != 0) {
                if (i21 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i5 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i3 & 16) != 0) {
                    ptVar = new pt(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    ptVar = rtVar;
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    h81Var2 = null;
                }
                if (i12 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == obj) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var2 = (ci2) objB0;
                } else {
                    ci2Var2 = ci2Var;
                }
                if ((i3 & 256) != 0) {
                    j30VarQ.e(436017687);
                    lg3 lg3Var111118 = sv.a;
                    long jG111111111115 = ((rv) j30VarQ.E(lg3Var111118)).g();
                    boolean z1111111111111111 = z2;
                    long jL111118 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111118)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111118)).k());
                    long jG111111111116 = ((rv) j30VarQ.E(lg3Var111118)).g();
                    long jB11111111111111111111119 = yu.b(jG111111111116, 0.24f);
                    long jB111111111111111111111110 = yu.b(((rv) j30VarQ.E(lg3Var111118)).f(), 0.32f);
                    long jB111111111111111111111111 = yu.b(jB111111111111111111111110, 0.12f);
                    int i21111111110 = i8;
                    long jB111111111111111111111112 = yu.b(sv.b(jG111111111116, j30VarQ), 0.54f);
                    vh0 vh0Var111118 = new vh0(jG111111111115, jL111118, jG111111111116, jB11111111111111111111119, jB111111111111111111111110, jB111111111111111111111111, jB111111111111111111111112, yu.b(jG111111111116, 0.54f), yu.b(jB111111111111111111111112, 0.12f), yu.b(jB111111111111111111111111, 0.12f));
                    j30VarQ.R(false);
                    z4 = z1111111111111111;
                    rtVar4 = ptVar;
                    i16 = i21111111110;
                    ci2Var4 = ci2Var2;
                    sm4Var2 = vh0Var111118;
                    h81Var3 = h81Var2;
                    pg2Var4 = pg2Var2;
                    i17 = i4 & (-234881025);
                } else {
                    boolean z1111111111111112 = z2;
                    rtVar3 = ptVar;
                    i15 = i4;
                    ci2Var3 = ci2Var2;
                    pg2Var3 = pg2Var2;
                    z3 = z1111111111111112;
                    sm4Var2 = sm4Var;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                    i16 = i8;
                    h81Var3 = h81Var2;
                    pg2Var4 = pg2Var3;
                    rtVar4 = rtVar3;
                    i17 = i15;
                }
            } else {
                if (i21 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i5 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i3 & 16) != 0) {
                    ptVar = new pt(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    ptVar = rtVar;
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    h81Var2 = null;
                }
                if (i12 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == obj) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var2 = (ci2) objB0;
                } else {
                    ci2Var2 = ci2Var;
                }
                if ((i3 & 256) != 0) {
                    j30VarQ.e(436017687);
                    lg3 lg3Var111119 = sv.a;
                    long jG111111111117 = ((rv) j30VarQ.E(lg3Var111119)).g();
                    boolean z1111111111111113 = z2;
                    long jL111119 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var111119)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var111119)).k());
                    long jG111111111118 = ((rv) j30VarQ.E(lg3Var111119)).g();
                    long jB111111111111111111111113 = yu.b(jG111111111118, 0.24f);
                    long jB111111111111111111111114 = yu.b(((rv) j30VarQ.E(lg3Var111119)).f(), 0.32f);
                    long jB111111111111111111111115 = yu.b(jB111111111111111111111114, 0.12f);
                    int i21111111111 = i8;
                    long jB111111111111111111111116 = yu.b(sv.b(jG111111111118, j30VarQ), 0.54f);
                    vh0 vh0Var111119 = new vh0(jG111111111117, jL111119, jG111111111118, jB111111111111111111111113, jB111111111111111111111114, jB111111111111111111111115, jB111111111111111111111116, yu.b(jG111111111118, 0.54f), yu.b(jB111111111111111111111116, 0.12f), yu.b(jB111111111111111111111115, 0.12f));
                    j30VarQ.R(false);
                    z4 = z1111111111111113;
                    rtVar4 = ptVar;
                    i16 = i21111111111;
                    ci2Var4 = ci2Var2;
                    sm4Var2 = vh0Var111119;
                    h81Var3 = h81Var2;
                    pg2Var4 = pg2Var2;
                    i17 = i4 & (-234881025);
                } else {
                    boolean z1111111111111114 = z2;
                    rtVar3 = ptVar;
                    i15 = i4;
                    ci2Var3 = ci2Var2;
                    pg2Var3 = pg2Var2;
                    z3 = z1111111111111114;
                    sm4Var2 = sm4Var;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                    i16 = i8;
                    h81Var3 = h81Var2;
                    pg2Var4 = pg2Var3;
                    rtVar4 = rtVar3;
                    i17 = i15;
                }
            }
            j30VarQ.S();
            if (i16 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            ri2 ri2VarF1110 = ps0.f0(j81Var, j30VarQ);
            Object objValueOf1111 = Integer.valueOf(i16);
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(objValueOf1111);
            objB1 = j30VarQ.b0();
            if (zI) {
                if (i16 == 0) {
                    arrayList = cs0.w;
                } else {
                    i18 = i16 + 2;
                    arrayList = new ArrayList(i18);
                    while (i19 < i18) {
                        arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                    }
                }
                j30VarQ.F0(arrayList);
                obj2 = arrayList;
            } else {
                if (i16 == 0) {
                    arrayList = cs0.w;
                } else {
                    i18 = i16 + 2;
                    arrayList = new ArrayList(i18);
                    while (i19 < i18) {
                        arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                    }
                }
                j30VarQ.F0(arrayList);
                obj2 = arrayList;
            }
            j30VarQ.R(false);
            List list1111 = (List) obj2;
            jt4 jt4Var1111 = f95.a;
            wo1.QnHx qnHx1111 = wo1.a;
            pg2 pg2VarA1111111 = f30.a(pg2Var4, qnHx1111, g95.w);
            float f1113 = 2 * a;
            pg2 pg2VarA1111112 = c94.a(c94.a(pg2VarA1111111.y(new lm4(f1113, f1113, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list1111, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
            vo1 vo1Var1111 = y31.a;
            ci2 ci2Var1116 = ci2Var4;
            int i21111111112 = i16;
            rt<Float> rtVar1116 = rtVar4;
            boolean z1111111111111115 = z4;
            ne.a(f30.a(pg2VarA1111112, qnHx1111, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list1111, sm4Var2, ri2VarF1110, h81Var3)), j30VarQ, 3072, 6);
            pg2Var5 = pg2Var4;
            h81Var4 = h81Var3;
            sm4Var3 = sm4Var2;
            z6 = z1111111111111115;
            i20 = i21111111112;
            ci2Var5 = ci2Var1116;
            rtVar5 = rtVar1116;
        } else {
            j30VarQ.t0();
            i14 = i2 & 1;
            obj = g30.QnHx.a;
            if (i14 != 0) {
                if (i21 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i5 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i3 & 16) != 0) {
                    ptVar = new pt(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    ptVar = rtVar;
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    h81Var2 = null;
                }
                if (i12 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == obj) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var2 = (ci2) objB0;
                } else {
                    ci2Var2 = ci2Var;
                }
                if ((i3 & 256) != 0) {
                    j30VarQ.e(436017687);
                    lg3 lg3Var1111110 = sv.a;
                    long jG111111111119 = ((rv) j30VarQ.E(lg3Var1111110)).g();
                    boolean z1111111111111116 = z2;
                    long jL1111110 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1111110)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1111110)).k());
                    long jG1111111111110 = ((rv) j30VarQ.E(lg3Var1111110)).g();
                    long jB111111111111111111111117 = yu.b(jG1111111111110, 0.24f);
                    long jB111111111111111111111118 = yu.b(((rv) j30VarQ.E(lg3Var1111110)).f(), 0.32f);
                    long jB111111111111111111111119 = yu.b(jB111111111111111111111118, 0.12f);
                    int i21111111113 = i8;
                    long jB1111111111111111111111110 = yu.b(sv.b(jG1111111111110, j30VarQ), 0.54f);
                    vh0 vh0Var1111110 = new vh0(jG111111111119, jL1111110, jG1111111111110, jB111111111111111111111117, jB111111111111111111111118, jB111111111111111111111119, jB1111111111111111111111110, yu.b(jG1111111111110, 0.54f), yu.b(jB1111111111111111111111110, 0.12f), yu.b(jB111111111111111111111119, 0.12f));
                    j30VarQ.R(false);
                    z4 = z1111111111111116;
                    rtVar4 = ptVar;
                    i16 = i21111111113;
                    ci2Var4 = ci2Var2;
                    sm4Var2 = vh0Var1111110;
                    h81Var3 = h81Var2;
                    pg2Var4 = pg2Var2;
                    i17 = i4 & (-234881025);
                } else {
                    boolean z1111111111111117 = z2;
                    rtVar3 = ptVar;
                    i15 = i4;
                    ci2Var3 = ci2Var2;
                    pg2Var3 = pg2Var2;
                    z3 = z1111111111111117;
                    sm4Var2 = sm4Var;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                    i16 = i8;
                    h81Var3 = h81Var2;
                    pg2Var4 = pg2Var3;
                    rtVar4 = rtVar3;
                    i17 = i15;
                }
            } else {
                if (i21 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i5 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i3 & 16) != 0) {
                    ptVar = new pt(0.0f, 1.0f);
                    i4 &= -57345;
                } else {
                    ptVar = rtVar;
                }
                if (i7 != 0) {
                    i8 = 0;
                }
                if (i10 != 0) {
                    h81Var2 = null;
                }
                if (i12 != 0) {
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == obj) {
                        objB0 = new di2();
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ci2Var2 = (ci2) objB0;
                } else {
                    ci2Var2 = ci2Var;
                }
                if ((i3 & 256) != 0) {
                    j30VarQ.e(436017687);
                    lg3 lg3Var1111111 = sv.a;
                    long jG1111111111111 = ((rv) j30VarQ.E(lg3Var1111111)).g();
                    boolean z1111111111111118 = z2;
                    long jL1111111 = hH.l(yu.b(((rv) j30VarQ.E(lg3Var1111111)).f(), AY.z(j30VarQ)), ((rv) j30VarQ.E(lg3Var1111111)).k());
                    long jG1111111111112 = ((rv) j30VarQ.E(lg3Var1111111)).g();
                    long jB1111111111111111111111111 = yu.b(jG1111111111112, 0.24f);
                    long jB1111111111111111111111112 = yu.b(((rv) j30VarQ.E(lg3Var1111111)).f(), 0.32f);
                    long jB1111111111111111111111113 = yu.b(jB1111111111111111111111112, 0.12f);
                    int i21111111114 = i8;
                    long jB1111111111111111111111114 = yu.b(sv.b(jG1111111111112, j30VarQ), 0.54f);
                    vh0 vh0Var1111111 = new vh0(jG1111111111111, jL1111111, jG1111111111112, jB1111111111111111111111111, jB1111111111111111111111112, jB1111111111111111111111113, jB1111111111111111111111114, yu.b(jG1111111111112, 0.54f), yu.b(jB1111111111111111111111114, 0.12f), yu.b(jB1111111111111111111111113, 0.12f));
                    j30VarQ.R(false);
                    z4 = z1111111111111118;
                    rtVar4 = ptVar;
                    i16 = i21111111114;
                    ci2Var4 = ci2Var2;
                    sm4Var2 = vh0Var1111111;
                    h81Var3 = h81Var2;
                    pg2Var4 = pg2Var2;
                    i17 = i4 & (-234881025);
                } else {
                    boolean z1111111111111119 = z2;
                    rtVar3 = ptVar;
                    i15 = i4;
                    ci2Var3 = ci2Var2;
                    pg2Var3 = pg2Var2;
                    z3 = z1111111111111119;
                    sm4Var2 = sm4Var;
                    z4 = z3;
                    ci2Var4 = ci2Var3;
                    i16 = i8;
                    h81Var3 = h81Var2;
                    pg2Var4 = pg2Var3;
                    rtVar4 = rtVar3;
                    i17 = i15;
                }
            }
            j30VarQ.S();
            if (i16 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            ri2 ri2VarF1111 = ps0.f0(j81Var, j30VarQ);
            Object objValueOf1112 = Integer.valueOf(i16);
            j30VarQ.e(1157296644);
            zI = j30VarQ.I(objValueOf1112);
            objB1 = j30VarQ.b0();
            if (zI) {
                if (i16 == 0) {
                    arrayList = cs0.w;
                } else {
                    i18 = i16 + 2;
                    arrayList = new ArrayList(i18);
                    while (i19 < i18) {
                        arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                    }
                }
                j30VarQ.F0(arrayList);
                obj2 = arrayList;
            } else {
                if (i16 == 0) {
                    arrayList = cs0.w;
                } else {
                    i18 = i16 + 2;
                    arrayList = new ArrayList(i18);
                    while (i19 < i18) {
                        arrayList.add(Float.valueOf(i19 / (i16 + 1)));
                    }
                }
                j30VarQ.F0(arrayList);
                obj2 = arrayList;
            }
            j30VarQ.R(false);
            List list1112 = (List) obj2;
            jt4 jt4Var1112 = f95.a;
            wo1.QnHx qnHx1112 = wo1.a;
            pg2 pg2VarA1111113 = f30.a(pg2Var4, qnHx1112, g95.w);
            float f1114 = 2 * a;
            pg2 pg2VarA1111114 = c94.a(c94.a(pg2VarA1111113.y(new lm4(f1114, f1114, Float.NaN, Float.NaN, false)), false, new gn4(z4, rtVar4, i16, list1112, AY.n(f2, rtVar4.b().floatValue(), rtVar4.e().floatValue()), j81Var)), true, new gf3(f2, rtVar4, i16));
            vo1 vo1Var1112 = y31.a;
            ci2 ci2Var1117 = ci2Var4;
            int i21111111115 = i16;
            rt<Float> rtVar1117 = rtVar4;
            boolean z11111111111111110 = z4;
            ne.a(f30.a(pg2VarA1111114, qnHx1112, new v31(ci2Var4, z4)), null, false, X.m(j30VarQ, 2085116814, new QnHx(rtVar4, i17, f2, ci2Var4, z4, list1112, sm4Var2, ri2VarF1111, h81Var3)), j30VarQ, 3072, 6);
            pg2Var5 = pg2Var4;
            h81Var4 = h81Var3;
            sm4Var3 = sm4Var2;
            z6 = z11111111111111110;
            i20 = i21111111115;
            ci2Var5 = ci2Var1117;
            rtVar5 = rtVar1117;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(f2, j81Var, pg2Var5, z6, rtVar5, i20, h81Var4, ci2Var5, sm4Var3, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ke keVar, pg2 pg2Var, float f2, ci2 ci2Var, sm4 sm4Var, boolean z, float f3, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(428907178);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(keVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(pg2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.g(f2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(ci2Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(sm4Var) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= j30VarQ.c(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= j30VarQ.g(f3) ? 1048576 : 524288;
        }
        if ((i2 & 2995931) == 599186 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            pg2 pg2VarB = keVar.b(ps0.X(pg2.QnHx.w, f2, 0.0f, 0.0f, 0.0f, 14), One.QnHx.d);
            j30VarQ.e(733328855);
            rb2 rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarB);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
            j30VarQ.e(-587645648);
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = new wp4();
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            wp4 wp4Var = (wp4) objB0;
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(ci2Var) | j30VarQ.I(wp4Var);
            Object objB1 = j30VarQ.b0();
            if (zI || objB1 == c0132QnHx) {
                objB1 = new F1(ci2Var, wp4Var, null);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            wq0.d(ci2Var, (x81) objB1, j30VarQ);
            float f4 = wp4Var.isEmpty() ^ true ? d : c;
            pg2 pg2VarA = f30.a(wj1.a(gm4.i(pg2Var, f3, f3), ci2Var, vs3.a(false, b, 0L, j30VarQ, 54, 4)), wo1.a, new qd1(ci2Var, true));
            if (!z) {
                f4 = 0;
            }
            lu3 lu3Var = mu3.a;
            hH.i(ps0.k(JUCk.d(pg2VarA, f4, lu3Var), ((yu) sm4Var.c(z, j30VarQ).getValue()).a, lu3Var), j30VarQ, 0);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(keVar, pg2Var, f2, ci2Var, sm4Var, z, f3, i);
    }

    public static final void c(pg2 pg2Var, sm4 sm4Var, boolean z, float f2, float f3, List<Float> list, float f4, float f5, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1833126050);
        gn.a(pg2Var, new NUlFixed(f4, sm4Var.a(z, false, j30VarQ), f5, f3, f2, sm4Var.a(z, true, j30VarQ), list, sm4Var.b(z, false, j30VarQ), sm4Var.b(z, true, j30VarQ)), j30VarQ, i & 14);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(pg2Var, sm4Var, z, f2, f3, list, f4, f5, i);
    }

    public static final void d(j81 j81Var, rt rtVar, rt rtVar2, ri2 ri2Var, float f2, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-743965752);
        int i2 = (i & 14) == 0 ? (j30VarQ.I(j81Var) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(rtVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(rtVar2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(ri2Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.g(f2) ? 16384 : 8192;
        }
        if ((i2 & 46811) == 9362 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            Object[] objArr = {rtVar, j81Var, Float.valueOf(f2), ri2Var, rtVar2};
            j30VarQ.e(-568225417);
            boolean zI = false;
            for (int i3 = 0; i3 < 5; i3++) {
                zI |= j30VarQ.I(objArr[i3]);
            }
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                vm4 vm4Var = new vm4(rtVar, j81Var, f2, ri2Var, rtVar2);
                j30VarQ.F0(vm4Var);
                objB0 = vm4Var;
            }
            j30VarQ.R(false);
            wq0.h((h81) objB0, j30VarQ);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new wm4(j81Var, rtVar, rtVar2, ri2Var, f2, i);
    }

    public static final void e(boolean z, float f2, List list, sm4 sm4Var, float f3, ci2 ci2Var, pg2 pg2Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1679682785);
        pg2 pg2VarY = pg2Var.y(f);
        j30VarQ.e(733328855);
        rb2 rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
        j30VarQ.e(-1323940314);
        jt4 jt4Var = r40.e;
        ij0 ij0Var = (ij0) j30VarQ.E(jt4Var);
        jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
        ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
        a30.e.getClass();
        yy1.QnHx qnHx = a30.QnHx.b;
        sz szVarJ = S12N.j(pg2VarY);
        if (!(j30VarQ.a instanceof jE)) {
            fp1.c0();
            throw null;
        }
        j30VarQ.s();
        if (j30VarQ.K) {
            j30VarQ.l(qnHx);
        } else {
            j30VarQ.A();
        }
        j30VarQ.x = false;
        hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
        hH.u(j30VarQ, ij0Var, a30.QnHx.d);
        hH.u(j30VarQ, jy1Var, a30.QnHx.f);
        Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
        le leVar = le.a;
        j30VarQ.e(231316251);
        ij0 ij0Var2 = (ij0) j30VarQ.E(jt4Var);
        float fB0 = ij0Var2.b0(e);
        float f4 = a;
        float fB1 = ij0Var2.b0(f4);
        float fQ = ij0Var2.Q(f3) * f2;
        pg2.QnHx qnHx2 = pg2.QnHx.w;
        int i2 = i >> 6;
        c(gm4.c, sm4Var, z, 0.0f, f2, list, fB1, fB0, j30VarQ, (i2 & 112) | 265222 | ((i << 6) & 896) | ((i << 9) & 57344));
        b(leVar, qnHx2, fQ, ci2Var, sm4Var, z, f4 * 2, j30VarQ, (i2 & 7168) | 1572918 | ((i << 3) & 57344) | ((i << 15) & 458752));
        O.g(j30VarQ, false, false, false, true);
        j30VarQ.R(false);
        j30VarQ.R(false);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new dn4(z, f2, list, sm4Var, f3, ci2Var, pg2Var, i);
    }
}
