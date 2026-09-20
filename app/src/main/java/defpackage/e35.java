package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class e35 {
    public static final long a = FWT.m(0, 0, 0, 0);
    public static final float b = 16;
    public static final float c = 12;
    public static final ee5 d;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> A;
        public final /* synthetic */ x81<g30, Integer, sd5> B;
        public final /* synthetic */ x81<g30, Integer, sd5> C;
        public final /* synthetic */ x81<g30, Integer, sd5> D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ wp1 H;
        public final /* synthetic */ ay2 I;
        public final /* synthetic */ k25 J;
        public final /* synthetic */ x81<g30, Integer, sd5> K;
        public final /* synthetic */ int L;
        public final /* synthetic */ int M;
        public final /* synthetic */ int N;
        public final /* synthetic */ w45 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ nk5 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(w45 w45Var, String str, x81<? super g30, ? super Integer, sd5> x81Var, nk5 nk5Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, x81<? super g30, ? super Integer, sd5> x81Var4, x81<? super g30, ? super Integer, sd5> x81Var5, boolean z, boolean z2, boolean z3, wp1 wp1Var, ay2 ay2Var, k25 k25Var, x81<? super g30, ? super Integer, sd5> x81Var6, int i, int i2, int i3) {
            super(2);
            this.w = w45Var;
            this.x = str;
            this.y = x81Var;
            this.z = nk5Var;
            this.A = x81Var2;
            this.B = x81Var3;
            this.C = x81Var4;
            this.D = x81Var5;
            this.E = z;
            this.F = z2;
            this.G = z3;
            this.H = wp1Var;
            this.I = ay2Var;
            this.J = k25Var;
            this.K = x81Var6;
            this.L = i;
            this.M = i2;
            this.N = i3;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            e35.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, g30Var, this.L | 1, this.M, this.N);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<oo1, g30, Integer, yu> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ k25 w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ wp1 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, int i2, wp1 wp1Var, k25 k25Var, boolean z, boolean z2) {
            super(3);
            this.w = k25Var;
            this.x = z;
            this.y = z2;
            this.z = wp1Var;
            this.A = i;
            this.B = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.y81
        public final yu invoke(oo1 oo1Var, g30 g30Var, Integer num) {
            oo1 oo1Var2 = oo1Var;
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(697243846);
            k25 k25Var = this.w;
            boolean z = this.x;
            boolean z2 = oo1Var2 == oo1.UnfocusedEmpty ? false : this.y;
            wp1 wp1Var = this.z;
            int i = (this.A >> 27) & 14;
            int i2 = this.B;
            long j = ((yu) k25Var.b(z, z2, wp1Var, g30Var2, i | ((i2 << 3) & 896) | (i2 & 7168)).getValue()).a;
            g30Var2.G();
            return new yu(j);
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ long w;
        public final /* synthetic */ w55 x;
        public final /* synthetic */ Float y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(long j, w55 w55Var, Float f, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
            super(2);
            this.w = j;
            this.x = w55Var;
            this.y = f;
            this.z = x81Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            e35.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ long w;
        public final /* synthetic */ Float x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i, long j, Float f, x81 x81Var) {
            super(2);
            this.w = j;
            this.x = f;
            this.y = x81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                q40.a(new ng3[]{r70.a.b(new yu(this.w))}, X.m(g30Var2, -1132188434, new f35(this.z, this.w, this.x, this.y)), g30Var2, 56);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements e91<Float, yu, yu, Float, g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ k25 B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ wp1 D;
        public final /* synthetic */ int E;
        public final /* synthetic */ x81<g30, Integer, sd5> F;
        public final /* synthetic */ x81<g30, Integer, sd5> G;
        public final /* synthetic */ w45 H;
        public final /* synthetic */ x81<g30, Integer, sd5> I;
        public final /* synthetic */ boolean J;
        public final /* synthetic */ ay2 K;
        public final /* synthetic */ boolean L;
        public final /* synthetic */ x81<g30, Integer, sd5> M;
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ String y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, String str, boolean z, int i, k25 k25Var, boolean z2, wp1 wp1Var, int i2, x81<? super g30, ? super Integer, sd5> x81Var3, x81<? super g30, ? super Integer, sd5> x81Var4, w45 w45Var, x81<? super g30, ? super Integer, sd5> x81Var5, boolean z3, ay2 ay2Var, boolean z4, x81<? super g30, ? super Integer, sd5> x81Var6) {
            super(6);
            this.w = x81Var;
            this.x = x81Var2;
            this.y = str;
            this.z = z;
            this.A = i;
            this.B = k25Var;
            this.C = z2;
            this.D = wp1Var;
            this.E = i2;
            this.F = x81Var3;
            this.G = x81Var4;
            this.H = w45Var;
            this.I = x81Var5;
            this.J = z3;
            this.K = ay2Var;
            this.L = z4;
            this.M = x81Var6;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.e91
        public final sd5 Z(Float f, yu yuVar, yu yuVar2, Float f2, g30 g30Var, Integer num) {
            int i;
            g30 g30Var2;
            sz szVarM;
            long j;
            long j2;
            float fFloatValue = f.floatValue();
            long j3 = yuVar.a;
            long j4 = yuVar2.a;
            float fFloatValue2 = f2.floatValue();
            g30 g30Var3 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i = (g30Var3.g(fFloatValue) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i |= g30Var3.j(j3) ? 32 : 16;
            }
            if ((iIntValue & 896) == 0) {
                i |= g30Var3.j(j4) ? 256 : 128;
            }
            if ((iIntValue & 7168) == 0) {
                i |= g30Var3.g(fFloatValue2) ? 2048 : 1024;
            }
            int i2 = i;
            if ((i2 & 46811) == 9362 && g30Var3.t()) {
                g30Var3.x();
            } else {
                x81<g30, Integer, sd5> x81Var = this.w;
                sz szVarM2 = x81Var != null ? X.m(g30Var3, 362863774, new y25(fFloatValue, j4, x81Var, i2, this.L, j3)) : null;
                if (this.x == null) {
                    g30Var2 = g30Var3;
                    szVarM = null;
                } else {
                    if (this.y.length() == 0) {
                        g30Var2 = g30Var3;
                        szVarM = X.m(g30Var2, 1120552650, new a35(fFloatValue2, this.B, this.C, this.E, this.A, this.x));
                    } else {
                        g30Var2 = g30Var3;
                        szVarM = null;
                    }
                }
                String strV = X.v(3, g30Var2);
                pg2.QnHx qnHx = pg2.QnHx.w;
                boolean z = this.z;
                Boolean boolValueOf = Boolean.valueOf(z);
                g30Var2.e(511388516);
                boolean zI = g30Var2.I(boolValueOf) | g30Var2.I(strV);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new c35(z, strV);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                pg2 pg2VarA = c94.a(qnHx, false, (j81) objF);
                k25 k25Var = this.B;
                boolean z2 = k25Var instanceof l25;
                boolean z3 = this.C;
                if (z2) {
                    g30Var2.e(-1083197894);
                    j = ((yu) ((l25) k25Var).h().getValue()).a;
                    g30Var2.G();
                } else {
                    g30Var2.e(-1083197798);
                    j = ((yu) k25Var.g(z3, z, g30Var2).getValue()).a;
                    g30Var2.G();
                }
                x81<g30, Integer, sd5> x81Var2 = this.F;
                sz szVarM3 = x81Var2 != null ? X.m(g30Var2, 1505327088, new z25(j, x81Var2)) : null;
                if (z2) {
                    g30Var2.e(-1083197452);
                    j2 = ((yu) ((l25) k25Var).i().getValue()).a;
                    g30Var2.G();
                } else {
                    g30Var2.e(-1083197355);
                    j2 = ((yu) k25Var.d(z3, z, g30Var2).getValue()).a;
                    g30Var2.G();
                }
                x81<g30, Integer, sd5> x81Var3 = this.G;
                sz szVarM4 = x81Var3 != null ? X.m(g30Var2, -1894727196, new b35(j2, x81Var3)) : null;
                int iOrdinal = this.H.ordinal();
                int i3 = this.E;
                int i4 = this.A;
                if (iOrdinal == 0) {
                    g30 g30Var4 = g30Var2;
                    g30Var4.e(-1083197019);
                    s35.b(pg2VarA, this.I, szVarM2, szVarM, szVarM3, szVarM4, this.J, fFloatValue, this.K, g30Var4, ((i3 >> 3) & 112) | ((i3 >> 6) & 3670016) | ((i2 << 21) & 29360128) | ((i4 << 18) & 234881024));
                    g30Var4.G();
                    sd5 sd5Var = sd5.a;
                } else if (iOrdinal != 1) {
                    g30Var2.e(-1083194976);
                    g30Var2.G();
                    sd5 sd5Var2 = sd5.a;
                } else {
                    g30Var2.e(-1083196463);
                    g30Var2.e(-492369756);
                    Object objF2 = g30Var2.f();
                    if (objF2 == c0132QnHx) {
                        objF2 = ps0.R(new cm4(cm4.b));
                        g30Var2.B(objF2);
                    }
                    g30Var2.G();
                    ri2 ri2Var = (ri2) objF2;
                    sz szVarM5 = X.m(g30Var2, 139886979, new d35(ri2Var, this.K, this.M, i4));
                    x81<g30, Integer, sd5> x81Var4 = this.I;
                    boolean z4 = this.J;
                    Float fValueOf = Float.valueOf(fFloatValue);
                    g30Var2.e(511388516);
                    boolean zI2 = g30Var2.I(fValueOf) | g30Var2.I(ri2Var);
                    Object objF3 = g30Var2.f();
                    if (zI2 || objF3 == c0132QnHx) {
                        objF3 = new x25(fFloatValue, ri2Var);
                        g30Var2.B(objF3);
                    }
                    g30Var2.G();
                    g30 g30Var5 = g30Var2;
                    iw2.b(pg2VarA, x81Var4, szVarM, szVarM2, szVarM3, szVarM4, z4, fFloatValue, (j81) objF3, szVarM5, this.K, g30Var5, ((i3 >> 3) & 112) | 805306368 | ((i3 >> 6) & 3670016) | ((i2 << 21) & 29360128), (i4 >> 6) & 14);
                    g30Var5.G();
                    sd5 sd5Var3 = sd5.a;
                }
            }
            return sd5.a;
        }
    }

    static {
        float f = 48;
        wo1.QnHx qnHx = wo1.a;
        d = new ee5(f, f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:102:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0147  */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:112:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0160  */
    /* JADX WARN: Code duplicated, block: B:117:0x0166  */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0173  */
    /* JADX WARN: Code duplicated, block: B:123:0x0176  */
    /* JADX WARN: Code duplicated, block: B:127:0x0180  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x0187  */
    /* JADX WARN: Code duplicated, block: B:132:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x019d  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:167:0x0200  */
    /* JADX WARN: Code duplicated, block: B:168:0x0203  */
    /* JADX WARN: Code duplicated, block: B:170:0x0207  */
    /* JADX WARN: Code duplicated, block: B:171:0x020a  */
    /* JADX WARN: Code duplicated, block: B:174:0x020f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0212  */
    /* JADX WARN: Code duplicated, block: B:178:0x0218  */
    /* JADX WARN: Code duplicated, block: B:179:0x021b  */
    /* JADX WARN: Code duplicated, block: B:181:0x021f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0222  */
    /* JADX WARN: Code duplicated, block: B:184:0x0226  */
    /* JADX WARN: Code duplicated, block: B:185:0x0229  */
    /* JADX WARN: Code duplicated, block: B:188:0x0240  */
    /* JADX WARN: Code duplicated, block: B:190:0x0244  */
    /* JADX WARN: Code duplicated, block: B:193:0x0277  */
    /* JADX WARN: Code duplicated, block: B:195:0x027b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0281  */
    /* JADX WARN: Code duplicated, block: B:198:0x0283  */
    /* JADX WARN: Code duplicated, block: B:200:0x0286  */
    /* JADX WARN: Code duplicated, block: B:201:0x0289  */
    /* JADX WARN: Code duplicated, block: B:204:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:206:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:214:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:216:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:217:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:220:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:221:0x030f  */
    /* JADX WARN: Code duplicated, block: B:224:0x0326  */
    /* JADX WARN: Code duplicated, block: B:226:0x032a  */
    /* JADX WARN: Code duplicated, block: B:227:0x032c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0330  */
    /* JADX WARN: Code duplicated, block: B:233:0x0340  */
    /* JADX WARN: Code duplicated, block: B:234:0x0343  */
    /* JADX WARN: Code duplicated, block: B:239:0x039e  */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x011a  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(w45 w45Var, String str, x81<? super g30, ? super Integer, sd5> x81Var, nk5 nk5Var, x81<? super g30, ? super Integer, sd5> x81Var2, x81<? super g30, ? super Integer, sd5> x81Var3, x81<? super g30, ? super Integer, sd5> x81Var4, x81<? super g30, ? super Integer, sd5> x81Var5, boolean z, boolean z2, boolean z3, wp1 wp1Var, ay2 ay2Var, k25 k25Var, x81<? super g30, ? super Integer, sd5> x81Var6, g30 g30Var, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        x81<? super g30, ? super Integer, sd5> x81Var7;
        x81<? super g30, ? super Integer, sd5> x81Var8;
        x81<? super g30, ? super Integer, sd5> x81Var9;
        boolean z4;
        boolean z5;
        boolean z6;
        x81<? super g30, ? super Integer, sd5> x81Var10;
        boolean zI;
        Object objB0;
        String str2;
        boolean z7;
        oo1 oo1Var;
        oo1 oo1Var2;
        F1 f1;
        long j;
        boolean z8;
        long jB;
        F1 f2;
        oo1 oo1Var3;
        long jB2;
        boolean z9;
        j30 j30Var;
        x81<? super g30, ? super Integer, sd5> x81Var11;
        x81<? super g30, ? super Integer, sd5> x81Var12;
        x81<? super g30, ? super Integer, sd5> x81Var13;
        boolean z10;
        boolean z11;
        boolean z12;
        x81<? super g30, ? super Integer, sd5> x81Var14;
        boolean z13;
        boolean z14;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-712568069);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (j30VarQ.I(w45Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= j30VarQ.I(str) ? 32 : 16;
        }
        if ((i3 & 4) == 0) {
            if ((i & 896) == 0) {
                i4 |= j30VarQ.I(x81Var) ? 256 : 128;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(nk5Var)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                if (j30VarQ.I(x81Var2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i & 458752) == 0) {
                if (j30VarQ.I(x81Var3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (j30VarQ.I(x81Var4)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (j30VarQ.I(x81Var5)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (j30VarQ.c(z)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            i15 = i3 & AdRequest.MAX_CONTENT_URL_LENGTH;
            if (i15 != 0) {
                i4 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                if (j30VarQ.c(z2)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i4 |= i16;
            }
            i17 = i4;
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (j30VarQ.c(z3)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            if ((i3 & 2048) != 0) {
                i19 |= 48;
            } else if ((i2 & 112) == 0) {
                if (j30VarQ.I(wp1Var)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i19 |= i21;
            }
            i22 = i19;
            if ((i3 & 4096) != 0) {
                if ((i2 & 896) == 0) {
                    i22 |= j30VarQ.I(ay2Var) ? 256 : 128;
                }
                if ((i3 & 8192) != 0) {
                    if ((i2 & 7168) == 0) {
                        i22 |= j30VarQ.I(k25Var) ? 2048 : 1024;
                    }
                    i23 = i3 & 16384;
                    if (i23 != 0) {
                        i22 |= 24576;
                    } else if ((i2 & 57344) == 0) {
                        i22 |= j30VarQ.I(x81Var6) ? 16384 : 8192;
                    }
                    if ((i17 & 1533916891) != 306783378 && (46811 & i22) == 9362 && j30VarQ.t()) {
                        j30VarQ.x();
                        x81Var12 = x81Var3;
                        x81Var11 = x81Var4;
                        x81Var13 = x81Var5;
                        z10 = z;
                        z11 = z2;
                        z12 = z3;
                        x81Var14 = x81Var6;
                        j30Var = j30VarQ;
                    } else {
                        if (i7 != 0) {
                            x81Var7 = null;
                        } else {
                            x81Var7 = x81Var3;
                        }
                        if (i9 != 0) {
                            x81Var8 = null;
                        } else {
                            x81Var8 = x81Var4;
                        }
                        if (i11 != 0) {
                            x81Var9 = null;
                        } else {
                            x81Var9 = x81Var5;
                        }
                        if (i13 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if (i15 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i18 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i23 != 0) {
                            x81Var10 = null;
                        } else {
                            x81Var10 = x81Var6;
                        }
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                        objB0 = j30VarQ.b0();
                        if (zI || objB0 == g30.QnHx.a) {
                            Z7jl z7jl = new Z7jl(str, null, 6);
                            ((mk5) nk5Var).getClass();
                            objB0 = new p95(z7jl, mt2.QnHx.a);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        str2 = ((p95) objB0).a.w;
                        if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                            oo1Var = oo1.Focused;
                        } else {
                            if (str2.length() == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                oo1Var = oo1.UnfocusedEmpty;
                            } else {
                                oo1Var = oo1.UnfocusedNotEmpty;
                            }
                        }
                        oo1Var2 = oo1Var;
                        f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                        jt4 jt4Var = sc5.a;
                        rc5 rc5Var = (rc5) j30VarQ.E(jt4Var);
                        w55 w55Var = rc5Var.g;
                        long jB3 = w55Var.b();
                        j = yu.h;
                        boolean zC = yu.c(jB3, j);
                        w55 w55Var2 = rc5Var.l;
                        z8 = !(zC || yu.c(w55Var2.b(), j)) || (!yu.c(w55Var.b(), j) && yu.c(w55Var2.b(), j));
                        v45 v45Var = v45.a;
                        j30VarQ.e(2129141006);
                        jB = ((rc5) j30VarQ.E(jt4Var)).l.b();
                        if (z8) {
                            if (jB != j) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                f2 = f1;
                                oo1Var3 = oo1Var2;
                            } else {
                                f2 = f1;
                                oo1Var3 = oo1Var2;
                                jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                            }
                        } else {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                        }
                        long j2 = jB;
                        j30VarQ.R(false);
                        jB2 = ((rc5) j30VarQ.E(jt4Var)).g.b();
                        if (z8) {
                            if (jB2 != j) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                            }
                        }
                        long j3 = jB2;
                        if (x81Var2 != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        j30Var = j30VarQ;
                        v45Var.a(oo1Var3, j2, j3, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                        x81Var11 = x81Var8;
                        x81Var12 = x81Var7;
                        x81Var13 = x81Var9;
                        z10 = z4;
                        z11 = z5;
                        z12 = z6;
                        x81Var14 = x81Var10;
                    }
                    tk3VarU = j30Var.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new CQf(w45Var, str, x81Var, nk5Var, x81Var2, x81Var12, x81Var11, x81Var13, z10, z11, z12, wp1Var, ay2Var, k25Var, x81Var14, i, i2, i3);
                }
                i22 |= 3072;
                i23 = i3 & 16384;
                if (i23 != 0) {
                    i22 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i22 |= j30VarQ.I(x81Var6) ? 16384 : 8192;
                }
                if ((i17 & 1533916891) != 306783378) {
                    if (i7 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var3;
                    }
                    if (i9 != 0) {
                        x81Var8 = null;
                    } else {
                        x81Var8 = x81Var4;
                    }
                    if (i11 != 0) {
                        x81Var9 = null;
                    } else {
                        x81Var9 = x81Var5;
                    }
                    if (i13 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i15 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i18 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i23 != 0) {
                        x81Var10 = null;
                    } else {
                        x81Var10 = x81Var6;
                    }
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        Z7jl z7jl2 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl2, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    } else {
                        Z7jl z7jl3 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl3, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    str2 = ((p95) objB0).a.w;
                    if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                        oo1Var = oo1.Focused;
                    } else {
                        if (str2.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            oo1Var = oo1.UnfocusedEmpty;
                        } else {
                            oo1Var = oo1.UnfocusedNotEmpty;
                        }
                    }
                    oo1Var2 = oo1Var;
                    f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                    jt4 jt4Var2 = sc5.a;
                    rc5 rc5Var2 = (rc5) j30VarQ.E(jt4Var2);
                    w55 w55Var3 = rc5Var2.g;
                    long jB4 = w55Var3.b();
                    j = yu.h;
                    boolean zC2 = yu.c(jB4, j);
                    w55 w55Var4 = rc5Var2.l;
                    if (zC2) {
                    }
                    v45 v45Var2 = v45.a;
                    j30VarQ.e(2129141006);
                    jB = ((rc5) j30VarQ.E(jt4Var2)).l.b();
                    if (z8) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        if (jB != j) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                        } else {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                            jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j4 = jB;
                    j30VarQ.R(false);
                    jB2 = ((rc5) j30VarQ.E(jt4Var2)).g.b();
                    if (z8) {
                        if (jB2 != j) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j5 = jB2;
                    if (x81Var2 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j30Var = j30VarQ;
                    v45Var2.a(oo1Var3, j4, j5, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                    x81Var11 = x81Var8;
                    x81Var12 = x81Var7;
                    x81Var13 = x81Var9;
                    z10 = z4;
                    z11 = z5;
                    z12 = z6;
                    x81Var14 = x81Var10;
                } else {
                    if (i7 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var3;
                    }
                    if (i9 != 0) {
                        x81Var8 = null;
                    } else {
                        x81Var8 = x81Var4;
                    }
                    if (i11 != 0) {
                        x81Var9 = null;
                    } else {
                        x81Var9 = x81Var5;
                    }
                    if (i13 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i15 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i18 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i23 != 0) {
                        x81Var10 = null;
                    } else {
                        x81Var10 = x81Var6;
                    }
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        Z7jl z7jl4 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl4, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    } else {
                        Z7jl z7jl5 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl5, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    str2 = ((p95) objB0).a.w;
                    if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                        oo1Var = oo1.Focused;
                    } else {
                        if (str2.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            oo1Var = oo1.UnfocusedEmpty;
                        } else {
                            oo1Var = oo1.UnfocusedNotEmpty;
                        }
                    }
                    oo1Var2 = oo1Var;
                    f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                    jt4 jt4Var3 = sc5.a;
                    rc5 rc5Var3 = (rc5) j30VarQ.E(jt4Var3);
                    w55 w55Var5 = rc5Var3.g;
                    long jB5 = w55Var5.b();
                    j = yu.h;
                    boolean zC3 = yu.c(jB5, j);
                    w55 w55Var6 = rc5Var3.l;
                    if (zC3) {
                    }
                    v45 v45Var3 = v45.a;
                    j30VarQ.e(2129141006);
                    jB = ((rc5) j30VarQ.E(jt4Var3)).l.b();
                    if (z8) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        if (jB != j) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                        } else {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                            jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j6 = jB;
                    j30VarQ.R(false);
                    jB2 = ((rc5) j30VarQ.E(jt4Var3)).g.b();
                    if (z8) {
                        if (jB2 != j) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j7 = jB2;
                    if (x81Var2 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j30Var = j30VarQ;
                    v45Var3.a(oo1Var3, j6, j7, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                    x81Var11 = x81Var8;
                    x81Var12 = x81Var7;
                    x81Var13 = x81Var9;
                    z10 = z4;
                    z11 = z5;
                    z12 = z6;
                    x81Var14 = x81Var10;
                }
                tk3VarU = j30Var.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(w45Var, str, x81Var, nk5Var, x81Var2, x81Var12, x81Var11, x81Var13, z10, z11, z12, wp1Var, ay2Var, k25Var, x81Var14, i, i2, i3);
            }
            i22 |= 384;
            if ((i3 & 8192) != 0) {
                if ((i2 & 7168) == 0) {
                    i22 |= j30VarQ.I(k25Var) ? 2048 : 1024;
                }
                i23 = i3 & 16384;
                if (i23 != 0) {
                    i22 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i22 |= j30VarQ.I(x81Var6) ? 16384 : 8192;
                }
                if ((i17 & 1533916891) != 306783378) {
                    if (i7 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var3;
                    }
                    if (i9 != 0) {
                        x81Var8 = null;
                    } else {
                        x81Var8 = x81Var4;
                    }
                    if (i11 != 0) {
                        x81Var9 = null;
                    } else {
                        x81Var9 = x81Var5;
                    }
                    if (i13 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i15 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i18 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i23 != 0) {
                        x81Var10 = null;
                    } else {
                        x81Var10 = x81Var6;
                    }
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        Z7jl z7jl6 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl6, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    } else {
                        Z7jl z7jl7 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl7, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    str2 = ((p95) objB0).a.w;
                    if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                        oo1Var = oo1.Focused;
                    } else {
                        if (str2.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            oo1Var = oo1.UnfocusedEmpty;
                        } else {
                            oo1Var = oo1.UnfocusedNotEmpty;
                        }
                    }
                    oo1Var2 = oo1Var;
                    f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                    jt4 jt4Var4 = sc5.a;
                    rc5 rc5Var4 = (rc5) j30VarQ.E(jt4Var4);
                    w55 w55Var7 = rc5Var4.g;
                    long jB6 = w55Var7.b();
                    j = yu.h;
                    boolean zC4 = yu.c(jB6, j);
                    w55 w55Var8 = rc5Var4.l;
                    if (zC4) {
                    }
                    v45 v45Var4 = v45.a;
                    j30VarQ.e(2129141006);
                    jB = ((rc5) j30VarQ.E(jt4Var4)).l.b();
                    if (z8) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        if (jB != j) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                        } else {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                            jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j8 = jB;
                    j30VarQ.R(false);
                    jB2 = ((rc5) j30VarQ.E(jt4Var4)).g.b();
                    if (z8) {
                        if (jB2 != j) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j9 = jB2;
                    if (x81Var2 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j30Var = j30VarQ;
                    v45Var4.a(oo1Var3, j8, j9, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                    x81Var11 = x81Var8;
                    x81Var12 = x81Var7;
                    x81Var13 = x81Var9;
                    z10 = z4;
                    z11 = z5;
                    z12 = z6;
                    x81Var14 = x81Var10;
                } else {
                    if (i7 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var3;
                    }
                    if (i9 != 0) {
                        x81Var8 = null;
                    } else {
                        x81Var8 = x81Var4;
                    }
                    if (i11 != 0) {
                        x81Var9 = null;
                    } else {
                        x81Var9 = x81Var5;
                    }
                    if (i13 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i15 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i18 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i23 != 0) {
                        x81Var10 = null;
                    } else {
                        x81Var10 = x81Var6;
                    }
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        Z7jl z7jl8 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl8, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    } else {
                        Z7jl z7jl9 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl9, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    str2 = ((p95) objB0).a.w;
                    if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                        oo1Var = oo1.Focused;
                    } else {
                        if (str2.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            oo1Var = oo1.UnfocusedEmpty;
                        } else {
                            oo1Var = oo1.UnfocusedNotEmpty;
                        }
                    }
                    oo1Var2 = oo1Var;
                    f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                    jt4 jt4Var5 = sc5.a;
                    rc5 rc5Var5 = (rc5) j30VarQ.E(jt4Var5);
                    w55 w55Var9 = rc5Var5.g;
                    long jB7 = w55Var9.b();
                    j = yu.h;
                    boolean zC5 = yu.c(jB7, j);
                    w55 w55Var10 = rc5Var5.l;
                    if (zC5) {
                    }
                    v45 v45Var5 = v45.a;
                    j30VarQ.e(2129141006);
                    jB = ((rc5) j30VarQ.E(jt4Var5)).l.b();
                    if (z8) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        if (jB != j) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                        } else {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                            jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j10 = jB;
                    j30VarQ.R(false);
                    jB2 = ((rc5) j30VarQ.E(jt4Var5)).g.b();
                    if (z8) {
                        if (jB2 != j) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j11 = jB2;
                    if (x81Var2 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j30Var = j30VarQ;
                    v45Var5.a(oo1Var3, j10, j11, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                    x81Var11 = x81Var8;
                    x81Var12 = x81Var7;
                    x81Var13 = x81Var9;
                    z10 = z4;
                    z11 = z5;
                    z12 = z6;
                    x81Var14 = x81Var10;
                }
                tk3VarU = j30Var.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(w45Var, str, x81Var, nk5Var, x81Var2, x81Var12, x81Var11, x81Var13, z10, z11, z12, wp1Var, ay2Var, k25Var, x81Var14, i, i2, i3);
            }
            i22 |= 3072;
            i23 = i3 & 16384;
            if (i23 != 0) {
                i22 |= 24576;
            } else if ((i2 & 57344) == 0) {
                i22 |= j30VarQ.I(x81Var6) ? 16384 : 8192;
            }
            if ((i17 & 1533916891) != 306783378) {
                if (i7 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var3;
                }
                if (i9 != 0) {
                    x81Var8 = null;
                } else {
                    x81Var8 = x81Var4;
                }
                if (i11 != 0) {
                    x81Var9 = null;
                } else {
                    x81Var9 = x81Var5;
                }
                if (i13 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i15 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i18 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i23 != 0) {
                    x81Var10 = null;
                } else {
                    x81Var10 = x81Var6;
                }
                j30VarQ.e(511388516);
                zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                objB0 = j30VarQ.b0();
                if (zI) {
                    Z7jl z7jl10 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl10, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                } else {
                    Z7jl z7jl11 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl11, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                str2 = ((p95) objB0).a.w;
                if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                    oo1Var = oo1.Focused;
                } else {
                    if (str2.length() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        oo1Var = oo1.UnfocusedEmpty;
                    } else {
                        oo1Var = oo1.UnfocusedNotEmpty;
                    }
                }
                oo1Var2 = oo1Var;
                f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                jt4 jt4Var6 = sc5.a;
                rc5 rc5Var6 = (rc5) j30VarQ.E(jt4Var6);
                w55 w55Var11 = rc5Var6.g;
                long jB8 = w55Var11.b();
                j = yu.h;
                boolean zC6 = yu.c(jB8, j);
                w55 w55Var12 = rc5Var6.l;
                if (zC6) {
                }
                v45 v45Var6 = v45.a;
                j30VarQ.e(2129141006);
                jB = ((rc5) j30VarQ.E(jt4Var6)).l.b();
                if (z8) {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                } else {
                    if (jB != j) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                        jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j12 = jB;
                j30VarQ.R(false);
                jB2 = ((rc5) j30VarQ.E(jt4Var6)).g.b();
                if (z8) {
                    if (jB2 != j) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j13 = jB2;
                if (x81Var2 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j30Var = j30VarQ;
                v45Var6.a(oo1Var3, j12, j13, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                x81Var11 = x81Var8;
                x81Var12 = x81Var7;
                x81Var13 = x81Var9;
                z10 = z4;
                z11 = z5;
                z12 = z6;
                x81Var14 = x81Var10;
            } else {
                if (i7 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var3;
                }
                if (i9 != 0) {
                    x81Var8 = null;
                } else {
                    x81Var8 = x81Var4;
                }
                if (i11 != 0) {
                    x81Var9 = null;
                } else {
                    x81Var9 = x81Var5;
                }
                if (i13 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i15 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i18 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i23 != 0) {
                    x81Var10 = null;
                } else {
                    x81Var10 = x81Var6;
                }
                j30VarQ.e(511388516);
                zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                objB0 = j30VarQ.b0();
                if (zI) {
                    Z7jl z7jl12 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl12, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                } else {
                    Z7jl z7jl13 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl13, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                str2 = ((p95) objB0).a.w;
                if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                    oo1Var = oo1.Focused;
                } else {
                    if (str2.length() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        oo1Var = oo1.UnfocusedEmpty;
                    } else {
                        oo1Var = oo1.UnfocusedNotEmpty;
                    }
                }
                oo1Var2 = oo1Var;
                f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                jt4 jt4Var7 = sc5.a;
                rc5 rc5Var7 = (rc5) j30VarQ.E(jt4Var7);
                w55 w55Var13 = rc5Var7.g;
                long jB9 = w55Var13.b();
                j = yu.h;
                boolean zC7 = yu.c(jB9, j);
                w55 w55Var14 = rc5Var7.l;
                if (zC7) {
                }
                v45 v45Var7 = v45.a;
                j30VarQ.e(2129141006);
                jB = ((rc5) j30VarQ.E(jt4Var7)).l.b();
                if (z8) {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                } else {
                    if (jB != j) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                        jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j14 = jB;
                j30VarQ.R(false);
                jB2 = ((rc5) j30VarQ.E(jt4Var7)).g.b();
                if (z8) {
                    if (jB2 != j) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j15 = jB2;
                if (x81Var2 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j30Var = j30VarQ;
                v45Var7.a(oo1Var3, j14, j15, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                x81Var11 = x81Var8;
                x81Var12 = x81Var7;
                x81Var13 = x81Var9;
                z10 = z4;
                z11 = z5;
                z12 = z6;
                x81Var14 = x81Var10;
            }
            tk3VarU = j30Var.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(w45Var, str, x81Var, nk5Var, x81Var2, x81Var12, x81Var11, x81Var13, z10, z11, z12, wp1Var, ay2Var, k25Var, x81Var14, i, i2, i3);
        }
        i4 |= 384;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(nk5Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            if (j30VarQ.I(x81Var2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i & 458752) == 0) {
            if (j30VarQ.I(x81Var3)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (j30VarQ.I(x81Var4)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (j30VarQ.I(x81Var5)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        i13 = i3 & 256;
        if (i13 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (j30VarQ.c(z)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i4 |= i14;
        }
        i15 = i3 & AdRequest.MAX_CONTENT_URL_LENGTH;
        if (i15 != 0) {
            i4 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            if (j30VarQ.c(z2)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i4 |= i16;
        }
        i17 = i4;
        i18 = i3 & 1024;
        if (i18 != 0) {
            i19 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (j30VarQ.c(z3)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i19 = i2 | i20;
        } else {
            i19 = i2;
        }
        if ((i3 & 2048) != 0) {
            i19 |= 48;
        } else if ((i2 & 112) == 0) {
            if (j30VarQ.I(wp1Var)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i19 |= i21;
        }
        i22 = i19;
        if ((i3 & 4096) != 0) {
            if ((i2 & 896) == 0) {
                i22 |= j30VarQ.I(ay2Var) ? 256 : 128;
            }
            if ((i3 & 8192) != 0) {
                if ((i2 & 7168) == 0) {
                    i22 |= j30VarQ.I(k25Var) ? 2048 : 1024;
                }
                i23 = i3 & 16384;
                if (i23 != 0) {
                    i22 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i22 |= j30VarQ.I(x81Var6) ? 16384 : 8192;
                }
                if ((i17 & 1533916891) != 306783378) {
                    if (i7 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var3;
                    }
                    if (i9 != 0) {
                        x81Var8 = null;
                    } else {
                        x81Var8 = x81Var4;
                    }
                    if (i11 != 0) {
                        x81Var9 = null;
                    } else {
                        x81Var9 = x81Var5;
                    }
                    if (i13 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i15 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i18 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i23 != 0) {
                        x81Var10 = null;
                    } else {
                        x81Var10 = x81Var6;
                    }
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        Z7jl z7jl14 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl14, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    } else {
                        Z7jl z7jl15 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl15, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    str2 = ((p95) objB0).a.w;
                    if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                        oo1Var = oo1.Focused;
                    } else {
                        if (str2.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            oo1Var = oo1.UnfocusedEmpty;
                        } else {
                            oo1Var = oo1.UnfocusedNotEmpty;
                        }
                    }
                    oo1Var2 = oo1Var;
                    f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                    jt4 jt4Var8 = sc5.a;
                    rc5 rc5Var8 = (rc5) j30VarQ.E(jt4Var8);
                    w55 w55Var15 = rc5Var8.g;
                    long jB10 = w55Var15.b();
                    j = yu.h;
                    boolean zC8 = yu.c(jB10, j);
                    w55 w55Var16 = rc5Var8.l;
                    if (zC8) {
                    }
                    v45 v45Var8 = v45.a;
                    j30VarQ.e(2129141006);
                    jB = ((rc5) j30VarQ.E(jt4Var8)).l.b();
                    if (z8) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        if (jB != j) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                        } else {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                            jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j16 = jB;
                    j30VarQ.R(false);
                    jB2 = ((rc5) j30VarQ.E(jt4Var8)).g.b();
                    if (z8) {
                        if (jB2 != j) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j17 = jB2;
                    if (x81Var2 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j30Var = j30VarQ;
                    v45Var8.a(oo1Var3, j16, j17, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                    x81Var11 = x81Var8;
                    x81Var12 = x81Var7;
                    x81Var13 = x81Var9;
                    z10 = z4;
                    z11 = z5;
                    z12 = z6;
                    x81Var14 = x81Var10;
                } else {
                    if (i7 != 0) {
                        x81Var7 = null;
                    } else {
                        x81Var7 = x81Var3;
                    }
                    if (i9 != 0) {
                        x81Var8 = null;
                    } else {
                        x81Var8 = x81Var4;
                    }
                    if (i11 != 0) {
                        x81Var9 = null;
                    } else {
                        x81Var9 = x81Var5;
                    }
                    if (i13 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i15 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i18 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i23 != 0) {
                        x81Var10 = null;
                    } else {
                        x81Var10 = x81Var6;
                    }
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        Z7jl z7jl16 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl16, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    } else {
                        Z7jl z7jl17 = new Z7jl(str, null, 6);
                        ((mk5) nk5Var).getClass();
                        objB0 = new p95(z7jl17, mt2.QnHx.a);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    str2 = ((p95) objB0).a.w;
                    if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                        oo1Var = oo1.Focused;
                    } else {
                        if (str2.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            oo1Var = oo1.UnfocusedEmpty;
                        } else {
                            oo1Var = oo1.UnfocusedNotEmpty;
                        }
                    }
                    oo1Var2 = oo1Var;
                    f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                    jt4 jt4Var9 = sc5.a;
                    rc5 rc5Var9 = (rc5) j30VarQ.E(jt4Var9);
                    w55 w55Var17 = rc5Var9.g;
                    long jB11 = w55Var17.b();
                    j = yu.h;
                    boolean zC9 = yu.c(jB11, j);
                    w55 w55Var18 = rc5Var9.l;
                    if (zC9) {
                    }
                    v45 v45Var9 = v45.a;
                    j30VarQ.e(2129141006);
                    jB = ((rc5) j30VarQ.E(jt4Var9)).l.b();
                    if (z8) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        if (jB != j) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                        } else {
                            f2 = f1;
                            oo1Var3 = oo1Var2;
                            jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j18 = jB;
                    j30VarQ.R(false);
                    jB2 = ((rc5) j30VarQ.E(jt4Var9)).g.b();
                    if (z8) {
                        if (jB2 != j) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                        }
                    }
                    long j19 = jB2;
                    if (x81Var2 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j30Var = j30VarQ;
                    v45Var9.a(oo1Var3, j18, j19, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                    x81Var11 = x81Var8;
                    x81Var12 = x81Var7;
                    x81Var13 = x81Var9;
                    z10 = z4;
                    z11 = z5;
                    z12 = z6;
                    x81Var14 = x81Var10;
                }
                tk3VarU = j30Var.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(w45Var, str, x81Var, nk5Var, x81Var2, x81Var12, x81Var11, x81Var13, z10, z11, z12, wp1Var, ay2Var, k25Var, x81Var14, i, i2, i3);
            }
            i22 |= 3072;
            i23 = i3 & 16384;
            if (i23 != 0) {
                i22 |= 24576;
            } else if ((i2 & 57344) == 0) {
                i22 |= j30VarQ.I(x81Var6) ? 16384 : 8192;
            }
            if ((i17 & 1533916891) != 306783378) {
                if (i7 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var3;
                }
                if (i9 != 0) {
                    x81Var8 = null;
                } else {
                    x81Var8 = x81Var4;
                }
                if (i11 != 0) {
                    x81Var9 = null;
                } else {
                    x81Var9 = x81Var5;
                }
                if (i13 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i15 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i18 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i23 != 0) {
                    x81Var10 = null;
                } else {
                    x81Var10 = x81Var6;
                }
                j30VarQ.e(511388516);
                zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                objB0 = j30VarQ.b0();
                if (zI) {
                    Z7jl z7jl18 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl18, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                } else {
                    Z7jl z7jl19 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl19, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                str2 = ((p95) objB0).a.w;
                if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                    oo1Var = oo1.Focused;
                } else {
                    if (str2.length() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        oo1Var = oo1.UnfocusedEmpty;
                    } else {
                        oo1Var = oo1.UnfocusedNotEmpty;
                    }
                }
                oo1Var2 = oo1Var;
                f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                jt4 jt4Var10 = sc5.a;
                rc5 rc5Var10 = (rc5) j30VarQ.E(jt4Var10);
                w55 w55Var19 = rc5Var10.g;
                long jB12 = w55Var19.b();
                j = yu.h;
                boolean zC10 = yu.c(jB12, j);
                w55 w55Var110 = rc5Var10.l;
                if (zC10) {
                }
                v45 v45Var10 = v45.a;
                j30VarQ.e(2129141006);
                jB = ((rc5) j30VarQ.E(jt4Var10)).l.b();
                if (z8) {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                } else {
                    if (jB != j) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                        jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j110 = jB;
                j30VarQ.R(false);
                jB2 = ((rc5) j30VarQ.E(jt4Var10)).g.b();
                if (z8) {
                    if (jB2 != j) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j111 = jB2;
                if (x81Var2 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j30Var = j30VarQ;
                v45Var10.a(oo1Var3, j110, j111, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                x81Var11 = x81Var8;
                x81Var12 = x81Var7;
                x81Var13 = x81Var9;
                z10 = z4;
                z11 = z5;
                z12 = z6;
                x81Var14 = x81Var10;
            } else {
                if (i7 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var3;
                }
                if (i9 != 0) {
                    x81Var8 = null;
                } else {
                    x81Var8 = x81Var4;
                }
                if (i11 != 0) {
                    x81Var9 = null;
                } else {
                    x81Var9 = x81Var5;
                }
                if (i13 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i15 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i18 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i23 != 0) {
                    x81Var10 = null;
                } else {
                    x81Var10 = x81Var6;
                }
                j30VarQ.e(511388516);
                zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                objB0 = j30VarQ.b0();
                if (zI) {
                    Z7jl z7jl110 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl110, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                } else {
                    Z7jl z7jl111 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl111, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                str2 = ((p95) objB0).a.w;
                if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                    oo1Var = oo1.Focused;
                } else {
                    if (str2.length() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        oo1Var = oo1.UnfocusedEmpty;
                    } else {
                        oo1Var = oo1.UnfocusedNotEmpty;
                    }
                }
                oo1Var2 = oo1Var;
                f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                jt4 jt4Var11 = sc5.a;
                rc5 rc5Var11 = (rc5) j30VarQ.E(jt4Var11);
                w55 w55Var111 = rc5Var11.g;
                long jB13 = w55Var111.b();
                j = yu.h;
                boolean zC11 = yu.c(jB13, j);
                w55 w55Var112 = rc5Var11.l;
                if (zC11) {
                }
                v45 v45Var11 = v45.a;
                j30VarQ.e(2129141006);
                jB = ((rc5) j30VarQ.E(jt4Var11)).l.b();
                if (z8) {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                } else {
                    if (jB != j) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                        jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j112 = jB;
                j30VarQ.R(false);
                jB2 = ((rc5) j30VarQ.E(jt4Var11)).g.b();
                if (z8) {
                    if (jB2 != j) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j113 = jB2;
                if (x81Var2 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j30Var = j30VarQ;
                v45Var11.a(oo1Var3, j112, j113, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                x81Var11 = x81Var8;
                x81Var12 = x81Var7;
                x81Var13 = x81Var9;
                z10 = z4;
                z11 = z5;
                z12 = z6;
                x81Var14 = x81Var10;
            }
            tk3VarU = j30Var.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(w45Var, str, x81Var, nk5Var, x81Var2, x81Var12, x81Var11, x81Var13, z10, z11, z12, wp1Var, ay2Var, k25Var, x81Var14, i, i2, i3);
        }
        i22 |= 384;
        if ((i3 & 8192) != 0) {
            if ((i2 & 7168) == 0) {
                i22 |= j30VarQ.I(k25Var) ? 2048 : 1024;
            }
            i23 = i3 & 16384;
            if (i23 != 0) {
                i22 |= 24576;
            } else if ((i2 & 57344) == 0) {
                i22 |= j30VarQ.I(x81Var6) ? 16384 : 8192;
            }
            if ((i17 & 1533916891) != 306783378) {
                if (i7 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var3;
                }
                if (i9 != 0) {
                    x81Var8 = null;
                } else {
                    x81Var8 = x81Var4;
                }
                if (i11 != 0) {
                    x81Var9 = null;
                } else {
                    x81Var9 = x81Var5;
                }
                if (i13 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i15 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i18 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i23 != 0) {
                    x81Var10 = null;
                } else {
                    x81Var10 = x81Var6;
                }
                j30VarQ.e(511388516);
                zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                objB0 = j30VarQ.b0();
                if (zI) {
                    Z7jl z7jl112 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl112, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                } else {
                    Z7jl z7jl113 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl113, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                str2 = ((p95) objB0).a.w;
                if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                    oo1Var = oo1.Focused;
                } else {
                    if (str2.length() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        oo1Var = oo1.UnfocusedEmpty;
                    } else {
                        oo1Var = oo1.UnfocusedNotEmpty;
                    }
                }
                oo1Var2 = oo1Var;
                f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                jt4 jt4Var12 = sc5.a;
                rc5 rc5Var12 = (rc5) j30VarQ.E(jt4Var12);
                w55 w55Var113 = rc5Var12.g;
                long jB14 = w55Var113.b();
                j = yu.h;
                boolean zC12 = yu.c(jB14, j);
                w55 w55Var114 = rc5Var12.l;
                if (zC12) {
                }
                v45 v45Var12 = v45.a;
                j30VarQ.e(2129141006);
                jB = ((rc5) j30VarQ.E(jt4Var12)).l.b();
                if (z8) {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                } else {
                    if (jB != j) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                        jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j114 = jB;
                j30VarQ.R(false);
                jB2 = ((rc5) j30VarQ.E(jt4Var12)).g.b();
                if (z8) {
                    if (jB2 != j) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j115 = jB2;
                if (x81Var2 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j30Var = j30VarQ;
                v45Var12.a(oo1Var3, j114, j115, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                x81Var11 = x81Var8;
                x81Var12 = x81Var7;
                x81Var13 = x81Var9;
                z10 = z4;
                z11 = z5;
                z12 = z6;
                x81Var14 = x81Var10;
            } else {
                if (i7 != 0) {
                    x81Var7 = null;
                } else {
                    x81Var7 = x81Var3;
                }
                if (i9 != 0) {
                    x81Var8 = null;
                } else {
                    x81Var8 = x81Var4;
                }
                if (i11 != 0) {
                    x81Var9 = null;
                } else {
                    x81Var9 = x81Var5;
                }
                if (i13 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i15 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i18 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i23 != 0) {
                    x81Var10 = null;
                } else {
                    x81Var10 = x81Var6;
                }
                j30VarQ.e(511388516);
                zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
                objB0 = j30VarQ.b0();
                if (zI) {
                    Z7jl z7jl114 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl114, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                } else {
                    Z7jl z7jl115 = new Z7jl(str, null, 6);
                    ((mk5) nk5Var).getClass();
                    objB0 = new p95(z7jl115, mt2.QnHx.a);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                str2 = ((p95) objB0).a.w;
                if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                    oo1Var = oo1.Focused;
                } else {
                    if (str2.length() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        oo1Var = oo1.UnfocusedEmpty;
                    } else {
                        oo1Var = oo1.UnfocusedNotEmpty;
                    }
                }
                oo1Var2 = oo1Var;
                f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
                jt4 jt4Var13 = sc5.a;
                rc5 rc5Var13 = (rc5) j30VarQ.E(jt4Var13);
                w55 w55Var115 = rc5Var13.g;
                long jB15 = w55Var115.b();
                j = yu.h;
                boolean zC13 = yu.c(jB15, j);
                w55 w55Var116 = rc5Var13.l;
                if (zC13) {
                }
                v45 v45Var13 = v45.a;
                j30VarQ.e(2129141006);
                jB = ((rc5) j30VarQ.E(jt4Var13)).l.b();
                if (z8) {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                } else {
                    if (jB != j) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                    } else {
                        f2 = f1;
                        oo1Var3 = oo1Var2;
                        jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j116 = jB;
                j30VarQ.R(false);
                jB2 = ((rc5) j30VarQ.E(jt4Var13)).g.b();
                if (z8) {
                    if (jB2 != j) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                    }
                }
                long j117 = jB2;
                if (x81Var2 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j30Var = j30VarQ;
                v45Var13.a(oo1Var3, j116, j117, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
                x81Var11 = x81Var8;
                x81Var12 = x81Var7;
                x81Var13 = x81Var9;
                z10 = z4;
                z11 = z5;
                z12 = z6;
                x81Var14 = x81Var10;
            }
            tk3VarU = j30Var.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(w45Var, str, x81Var, nk5Var, x81Var2, x81Var12, x81Var11, x81Var13, z10, z11, z12, wp1Var, ay2Var, k25Var, x81Var14, i, i2, i3);
        }
        i22 |= 3072;
        i23 = i3 & 16384;
        if (i23 != 0) {
            i22 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i22 |= j30VarQ.I(x81Var6) ? 16384 : 8192;
        }
        if ((i17 & 1533916891) != 306783378) {
            if (i7 != 0) {
                x81Var7 = null;
            } else {
                x81Var7 = x81Var3;
            }
            if (i9 != 0) {
                x81Var8 = null;
            } else {
                x81Var8 = x81Var4;
            }
            if (i11 != 0) {
                x81Var9 = null;
            } else {
                x81Var9 = x81Var5;
            }
            if (i13 != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            if (i15 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i18 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            if (i23 != 0) {
                x81Var10 = null;
            } else {
                x81Var10 = x81Var6;
            }
            j30VarQ.e(511388516);
            zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
            objB0 = j30VarQ.b0();
            if (zI) {
                Z7jl z7jl116 = new Z7jl(str, null, 6);
                ((mk5) nk5Var).getClass();
                objB0 = new p95(z7jl116, mt2.QnHx.a);
                j30VarQ.F0(objB0);
            } else {
                Z7jl z7jl117 = new Z7jl(str, null, 6);
                ((mk5) nk5Var).getClass();
                objB0 = new p95(z7jl117, mt2.QnHx.a);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            str2 = ((p95) objB0).a.w;
            if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                oo1Var = oo1.Focused;
            } else {
                if (str2.length() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    oo1Var = oo1.UnfocusedEmpty;
                } else {
                    oo1Var = oo1.UnfocusedNotEmpty;
                }
            }
            oo1Var2 = oo1Var;
            f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
            jt4 jt4Var14 = sc5.a;
            rc5 rc5Var14 = (rc5) j30VarQ.E(jt4Var14);
            w55 w55Var117 = rc5Var14.g;
            long jB16 = w55Var117.b();
            j = yu.h;
            boolean zC14 = yu.c(jB16, j);
            w55 w55Var118 = rc5Var14.l;
            if (zC14) {
            }
            v45 v45Var14 = v45.a;
            j30VarQ.e(2129141006);
            jB = ((rc5) j30VarQ.E(jt4Var14)).l.b();
            if (z8) {
                f2 = f1;
                oo1Var3 = oo1Var2;
            } else {
                if (jB != j) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                } else {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                    jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                }
            }
            long j118 = jB;
            j30VarQ.R(false);
            jB2 = ((rc5) j30VarQ.E(jt4Var14)).g.b();
            if (z8) {
                if (jB2 != j) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                }
            }
            long j119 = jB2;
            if (x81Var2 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            j30Var = j30VarQ;
            v45Var14.a(oo1Var3, j118, j119, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
            x81Var11 = x81Var8;
            x81Var12 = x81Var7;
            x81Var13 = x81Var9;
            z10 = z4;
            z11 = z5;
            z12 = z6;
            x81Var14 = x81Var10;
        } else {
            if (i7 != 0) {
                x81Var7 = null;
            } else {
                x81Var7 = x81Var3;
            }
            if (i9 != 0) {
                x81Var8 = null;
            } else {
                x81Var8 = x81Var4;
            }
            if (i11 != 0) {
                x81Var9 = null;
            } else {
                x81Var9 = x81Var5;
            }
            if (i13 != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            if (i15 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i18 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            if (i23 != 0) {
                x81Var10 = null;
            } else {
                x81Var10 = x81Var6;
            }
            j30VarQ.e(511388516);
            zI = j30VarQ.I(str) | j30VarQ.I(nk5Var);
            objB0 = j30VarQ.b0();
            if (zI) {
                Z7jl z7jl118 = new Z7jl(str, null, 6);
                ((mk5) nk5Var).getClass();
                objB0 = new p95(z7jl118, mt2.QnHx.a);
                j30VarQ.F0(objB0);
            } else {
                Z7jl z7jl119 = new Z7jl(str, null, 6);
                ((mk5) nk5Var).getClass();
                objB0 = new p95(z7jl119, mt2.QnHx.a);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            str2 = ((p95) objB0).a.w;
            if (((Boolean) m21.a(wp1Var, j30VarQ, (i22 >> 3) & 14).getValue()).booleanValue()) {
                oo1Var = oo1.Focused;
            } else {
                if (str2.length() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    oo1Var = oo1.UnfocusedEmpty;
                } else {
                    oo1Var = oo1.UnfocusedNotEmpty;
                }
            }
            oo1Var2 = oo1Var;
            f1 = new F1(i17, i22, wp1Var, k25Var, z5, z6);
            jt4 jt4Var15 = sc5.a;
            rc5 rc5Var15 = (rc5) j30VarQ.E(jt4Var15);
            w55 w55Var119 = rc5Var15.g;
            long jB17 = w55Var119.b();
            j = yu.h;
            boolean zC15 = yu.c(jB17, j);
            w55 w55Var1110 = rc5Var15.l;
            if (zC15) {
            }
            v45 v45Var15 = v45.a;
            j30VarQ.e(2129141006);
            jB = ((rc5) j30VarQ.E(jt4Var15)).l.b();
            if (z8) {
                f2 = f1;
                oo1Var3 = oo1Var2;
            } else {
                if (jB != j) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                } else {
                    f2 = f1;
                    oo1Var3 = oo1Var2;
                    jB = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                }
            }
            long j1110 = jB;
            j30VarQ.R(false);
            jB2 = ((rc5) j30VarQ.E(jt4Var15)).g.b();
            if (z8) {
                if (jB2 != j) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    jB2 = ((yu) f2.invoke(oo1Var3, j30VarQ, 0)).a;
                }
            }
            long j1111 = jB2;
            if (x81Var2 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            j30Var = j30VarQ;
            v45Var15.a(oo1Var3, j1110, j1111, f2, z9, X.m(j30Var, 341865432, new QnHx(x81Var2, x81Var7, str2, z6, i22, k25Var, z5, wp1Var, i17, x81Var8, x81Var9, w45Var, x81Var, z4, ay2Var, z8, x81Var10)), j30Var, 1769472);
            x81Var11 = x81Var8;
            x81Var12 = x81Var7;
            x81Var13 = x81Var9;
            z10 = z4;
            z11 = z5;
            z12 = z6;
            x81Var14 = x81Var10;
        }
        tk3VarU = j30Var.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(w45Var, str, x81Var, nk5Var, x81Var2, x81Var12, x81Var11, x81Var13, z10, z11, z12, wp1Var, ay2Var, k25Var, x81Var14, i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void b(long j, w55 w55Var, Float f, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        w55 w55Var2;
        int i4;
        Float f2;
        int i5;
        int i6;
        Float f3;
        sz szVarM;
        w55 w55Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-399493340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.j(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                w55Var2 = w55Var;
                i3 |= j30VarQ.I(w55Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    f2 = f;
                    if (j30VarQ.I(f2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.I(x81Var)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                    if (i7 != 0) {
                        w55Var2 = null;
                    }
                    if (i4 != 0) {
                        f3 = null;
                    } else {
                        f3 = f2;
                    }
                    szVarM = X.m(j30VarQ, 494684590, new NUlFixed(i3, j, f3, x81Var));
                    if (w55Var2 != null) {
                        j30VarQ.e(-2009952864);
                        j55.a(w55Var2, szVarM, j30VarQ, ((i3 >> 3) & 14) | 48);
                    } else {
                        j30VarQ.e(-2009952812);
                        szVarM.invoke(j30VarQ, 6);
                    }
                    j30VarQ.R(false);
                    w55Var3 = w55Var2;
                } else {
                    j30VarQ.x();
                    w55Var3 = w55Var2;
                    f3 = f2;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(j, w55Var3, f3, x81Var, i, i2);
            }
            i3 |= 384;
            f2 = f;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(x81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    w55Var2 = null;
                }
                if (i4 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
                szVarM = X.m(j30VarQ, 494684590, new NUlFixed(i3, j, f3, x81Var));
                if (w55Var2 != null) {
                    j30VarQ.e(-2009952864);
                    j55.a(w55Var2, szVarM, j30VarQ, ((i3 >> 3) & 14) | 48);
                } else {
                    j30VarQ.e(-2009952812);
                    szVarM.invoke(j30VarQ, 6);
                }
                j30VarQ.R(false);
                w55Var3 = w55Var2;
            } else {
                if (i7 != 0) {
                    w55Var2 = null;
                }
                if (i4 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
                szVarM = X.m(j30VarQ, 494684590, new NUlFixed(i3, j, f3, x81Var));
                if (w55Var2 != null) {
                    j30VarQ.e(-2009952864);
                    j55.a(w55Var2, szVarM, j30VarQ, ((i3 >> 3) & 14) | 48);
                } else {
                    j30VarQ.e(-2009952812);
                    szVarM.invoke(j30VarQ, 6);
                }
                j30VarQ.R(false);
                w55Var3 = w55Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(j, w55Var3, f3, x81Var, i, i2);
        }
        i3 |= 48;
        w55Var2 = w55Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                f2 = f;
                if (j30VarQ.I(f2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(x81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    w55Var2 = null;
                }
                if (i4 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
                szVarM = X.m(j30VarQ, 494684590, new NUlFixed(i3, j, f3, x81Var));
                if (w55Var2 != null) {
                    j30VarQ.e(-2009952864);
                    j55.a(w55Var2, szVarM, j30VarQ, ((i3 >> 3) & 14) | 48);
                } else {
                    j30VarQ.e(-2009952812);
                    szVarM.invoke(j30VarQ, 6);
                }
                j30VarQ.R(false);
                w55Var3 = w55Var2;
            } else {
                if (i7 != 0) {
                    w55Var2 = null;
                }
                if (i4 != 0) {
                    f3 = null;
                } else {
                    f3 = f2;
                }
                szVarM = X.m(j30VarQ, 494684590, new NUlFixed(i3, j, f3, x81Var));
                if (w55Var2 != null) {
                    j30VarQ.e(-2009952864);
                    j55.a(w55Var2, szVarM, j30VarQ, ((i3 >> 3) & 14) | 48);
                } else {
                    j30VarQ.e(-2009952812);
                    szVarM.invoke(j30VarQ, 6);
                }
                j30VarQ.R(false);
                w55Var3 = w55Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(j, w55Var3, f3, x81Var, i, i2);
        }
        i3 |= 384;
        f2 = f;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(x81Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170) {
            if (i7 != 0) {
                w55Var2 = null;
            }
            if (i4 != 0) {
                f3 = null;
            } else {
                f3 = f2;
            }
            szVarM = X.m(j30VarQ, 494684590, new NUlFixed(i3, j, f3, x81Var));
            if (w55Var2 != null) {
                j30VarQ.e(-2009952864);
                j55.a(w55Var2, szVarM, j30VarQ, ((i3 >> 3) & 14) | 48);
            } else {
                j30VarQ.e(-2009952812);
                szVarM.invoke(j30VarQ, 6);
            }
            j30VarQ.R(false);
            w55Var3 = w55Var2;
        } else {
            if (i7 != 0) {
                w55Var2 = null;
            }
            if (i4 != 0) {
                f3 = null;
            } else {
                f3 = f2;
            }
            szVarM = X.m(j30VarQ, 494684590, new NUlFixed(i3, j, f3, x81Var));
            if (w55Var2 != null) {
                j30VarQ.e(-2009952864);
                j55.a(w55Var2, szVarM, j30VarQ, ((i3 >> 3) & 14) | 48);
            } else {
                j30VarQ.e(-2009952812);
                szVarM.invoke(j30VarQ, 6);
            }
            j30VarQ.R(false);
            w55Var3 = w55Var2;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(j, w55Var3, f3, x81Var, i, i2);
    }

    public static final Object c(zq1 zq1Var) {
        Object objB = zq1Var.B();
        my1 my1Var = objB instanceof my1 ? (my1) objB : null;
        if (my1Var != null) {
            return my1Var.a();
        }
        return null;
    }

    public static final int d(b43 b43Var) {
        if (b43Var != null) {
            return b43Var.x;
        }
        return 0;
    }

    public static final int e(b43 b43Var) {
        if (b43Var != null) {
            return b43Var.w;
        }
        return 0;
    }
}
