package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class u02 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ o02 w;
        public final /* synthetic */ q12 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(o02 o02Var, q12 q12Var, int i) {
            super(2);
            this.w = o02Var;
            this.x = q12Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            u02.b(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ qy0 B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ One.CQf D;
        public final /* synthetic */ CZ9P.FJCM E;
        public final /* synthetic */ One.F1 F;
        public final /* synthetic */ CZ9P.LPt8Fixed G;
        public final /* synthetic */ j81<h12, sd5> H;
        public final /* synthetic */ int I;
        public final /* synthetic */ int J;
        public final /* synthetic */ int K;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ q12 x;
        public final /* synthetic */ ay2 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(pg2 pg2Var, q12 q12Var, ay2 ay2Var, boolean z, boolean z2, qy0 qy0Var, boolean z3, One.CQf cQf, CZ9P.FJCM fjcm, One.F1 f1, CZ9P.LPt8Fixed lPt8, j81<? super h12, sd5> j81Var, int i, int i2, int i3) {
            super(2);
            this.w = pg2Var;
            this.x = q12Var;
            this.y = ay2Var;
            this.z = z;
            this.A = z2;
            this.B = qy0Var;
            this.C = z3;
            this.D = cQf;
            this.E = fjcm;
            this.F = f1;
            this.G = lPt8;
            this.H = j81Var;
            this.I = i;
            this.J = i2;
            this.K = i3;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            u02.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, g30Var, this.I | 1, this.J, this.K);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:116:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x014d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:121:0x0157  */
    /* JADX WARN: Code duplicated, block: B:122:0x015a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0188  */
    /* JADX WARN: Code duplicated, block: B:135:0x018b  */
    /* JADX WARN: Code duplicated, block: B:137:0x018f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0192  */
    /* JADX WARN: Code duplicated, block: B:140:0x0196  */
    /* JADX WARN: Code duplicated, block: B:141:0x0199  */
    /* JADX WARN: Code duplicated, block: B:143:0x019d  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:155:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x0219  */
    /* JADX WARN: Code duplicated, block: B:159:0x0240  */
    /* JADX WARN: Code duplicated, block: B:162:0x025e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x0292  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ef A[LOOP:0: B:168:0x02ed->B:169:0x02ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:172:0x0302 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0314  */
    /* JADX WARN: Code duplicated, block: B:178:0x035b  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e  */
    /* JADX WARN: Code duplicated, block: B:182:0x039c A[LOOP:1: B:181:0x039a->B:182:0x039c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:188:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:193:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:195:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:202:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:206:0x042b  */
    /* JADX WARN: Code duplicated, block: B:207:0x042e  */
    /* JADX WARN: Code duplicated, block: B:210:0x045d A[LOOP:2: B:209:0x045b->B:210:0x045d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x046f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x0471  */
    /* JADX WARN: Code duplicated, block: B:217:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:221:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:224:0x04d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x0503  */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(pg2 pg2Var, q12 q12Var, ay2 ay2Var, boolean z, boolean z2, qy0 qy0Var, boolean z3, One.CQf cQf, CZ9P.FJCM fjcm, One.F1 f1, CZ9P.LPt8Fixed lPt8, j81<? super h12, sd5> j81Var, g30 g30Var, int i, int i2, int i3) {
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
        One.CQf cQf2;
        CZ9P.FJCM fjcm2;
        One.F1 f2;
        CZ9P.LPt8Fixed lPt9;
        tw2 tw2VarF;
        ri2 ri2VarF0;
        boolean zI;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        cp4 cp4VarF;
        cp4 cp4VarI;
        ri2 ri2Var;
        boolean zI2;
        Object objB1;
        p02 p02Var;
        Object objB2;
        h02 h02Var;
        Object objB3;
        ua0 ua0Var;
        boolean zI3;
        Object objB4;
        m02 m02Var;
        Object[] objArr;
        int i15;
        int i16;
        boolean zI4;
        Object objB5;
        h02 h02Var2;
        p02 p02Var2;
        j30 j30Var;
        e22 e22Var;
        aw2 aw2Var;
        aw2 aw2Var2;
        Object[] objArr2;
        int i17;
        boolean zI5;
        Object objB6;
        g30.QnHx.C0132QnHx c0132QnHx2;
        boolean z4;
        ua0 ua0Var2;
        Object c22Var;
        int i18;
        int i19;
        g30.QnHx.C0132QnHx c0132QnHx3;
        pg2 pg2Var2;
        jy1 jy1Var;
        Object[] objArr3;
        h02 h02Var3;
        int i20;
        boolean zI6;
        Object objB7;
        boolean zI7;
        Object objB8;
        boolean z5;
        boolean z6;
        One.CQf cQf3;
        One.F1 f3;
        CZ9P.LPt8Fixed lPt10;
        tk3 tk3VarU;
        int i21;
        j30 j30VarQ = g30Var.q(955299798);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= j30VarQ.I(q12Var) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= j30VarQ.I(ay2Var) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= j30VarQ.c(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= j30VarQ.c(z2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((458752 & i) == 0) {
            i4 |= j30VarQ.I(qy0Var) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            i21 = (3670016 & i) == 0 ? j30VarQ.c(z3) ? 1048576 : 524288 : 1572864;
            i5 = i3 & 128;
            if (i5 != 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (j30VarQ.I(cQf)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (j30VarQ.I(fjcm)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            i9 = i3 & AdRequest.MAX_CONTENT_URL_LENGTH;
            if (i9 != 0) {
                i4 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                if (j30VarQ.I(f1)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
                i12 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (j30VarQ.I(lPt8)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i12 = i2 | i13;
            } else {
                i12 = i2;
            }
            if ((i3 & 2048) != 0) {
                i12 |= 48;
            } else if ((i2 & 112) == 0) {
                if (j30VarQ.I(j81Var)) {
                    i14 = 32;
                } else {
                    i14 = 16;
                }
                i12 |= i14;
            }
            if ((1533916891 & i4) != 306783378 && (i12 & 91) == 18 && j30VarQ.t()) {
                j30VarQ.x();
                cQf3 = cQf;
                fjcm2 = fjcm;
                f3 = f1;
                lPt10 = lPt8;
                j30Var = j30VarQ;
            } else {
                if (i5 != 0) {
                    cQf2 = null;
                } else {
                    cQf2 = cQf;
                }
                if (i7 != 0) {
                    fjcm2 = null;
                } else {
                    fjcm2 = fjcm;
                }
                if (i9 != 0) {
                    f2 = null;
                } else {
                    f2 = f1;
                }
                if (i11 != 0) {
                    lPt9 = null;
                } else {
                    lPt9 = lPt8;
                }
                tw2VarF = qe0.f(j30VarQ);
                j30VarQ.e(-619676707);
                ri2VarF0 = ps0.f0(j81Var, j30VarQ);
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(q12Var);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (zI || objB0 == c0132QnHx) {
                    cp4VarF = ip4.f((cp4) ip4.b.h(), null, false);
                    try {
                        cp4VarI = cp4VarF.i();
                        try {
                            int iE = (q12Var.e() / 30) * 30;
                            pp1 pp1VarV = AY.V(Math.max(iE - 100, 0), iE + 30 + 100);
                            cp4.o(cp4VarI);
                            cp4VarF.c();
                            objB0 = ps0.R(pp1VarV);
                            j30VarQ.F0(objB0);
                        } catch (Throwable th) {
                            cp4.o(cp4VarI);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        cp4VarF.c();
                        throw th2;
                    }
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                wq0.d(ri2Var, new r02(q12Var, ri2Var, null), j30VarQ);
                j30VarQ.e(1157296644);
                zI2 = j30VarQ.I(ri2Var);
                objB1 = j30VarQ.b0();
                if (zI2 || objB1 == c0132QnHx) {
                    objB1 = new p02(ps0.x(new s02(ri2VarF0, ri2Var)));
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                p02Var = (p02) objB1;
                j30VarQ.R(false);
                j30VarQ.e(-492369756);
                objB2 = j30VarQ.b0();
                if (objB2 == c0132QnHx) {
                    objB2 = new h02();
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                h02Var = (h02) objB2;
                j30VarQ.e(773894976);
                j30VarQ.e(-492369756);
                objB3 = j30VarQ.b0();
                if (objB3 == c0132QnHx) {
                    s40 s40Var = new s40(wq0.i(j30VarQ));
                    j30VarQ.F0(s40Var);
                    objB3 = s40Var;
                }
                j30VarQ.R(false);
                ua0Var = ((s40) objB3).w;
                j30VarQ.R(false);
                Boolean boolValueOf = Boolean.valueOf(z2);
                j30VarQ.e(511388516);
                zI3 = j30VarQ.I(q12Var) | j30VarQ.I(boolValueOf);
                objB4 = j30VarQ.b0();
                if (zI3 || objB4 == c0132QnHx) {
                    objB4 = new m02(ua0Var, z2);
                    j30VarQ.F0(objB4);
                }
                j30VarQ.R(false);
                m02Var = (m02) objB4;
                q12Var.n.setValue(m02Var);
                int i22 = i4 & 112;
                j30VarQ.e(-1404987696);
                objArr = new Object[]{q12Var, h02Var, tw2VarF, ay2Var, Boolean.valueOf(z), Boolean.valueOf(z2), cQf2, f2, lPt9, fjcm2, m02Var};
                j30VarQ.e(-568225417);
                i15 = 0;
                zI4 = false;
                for (i16 = 11; i15 < i16; i16 = 11) {
                    zI4 |= j30VarQ.I(objArr[i15]);
                    i15++;
                }
                objB5 = j30VarQ.b0();
                if (!zI4 || objB5 == c0132QnHx) {
                    h02Var2 = h02Var;
                    p02Var2 = p02Var;
                    j30Var = j30VarQ;
                    e22Var = null;
                    x02 x02Var = new x02(z2, ay2Var, z, q12Var, p02Var2, fjcm2, lPt9, m02Var, h02Var2, cQf2, f2, tw2VarF);
                    j30Var.F0(x02Var);
                    objB5 = x02Var;
                } else {
                    h02Var2 = h02Var;
                    p02Var2 = p02Var;
                    j30Var = j30VarQ;
                    e22Var = null;
                }
                j30Var.R(false);
                x81 x81Var = (x81) objB5;
                j30Var.R(false);
                p02 p02Var3 = p02Var2;
                b(p02Var3, q12Var, j30Var, i22);
                if (
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1332
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.u02.a(pg2, q12, ay2, boolean, boolean, qy0, boolean, One$CQf, CZ9P$FJCM, One$F1, CZ9P$LPt8, j81, g30, int, int, int):void");
            }

            public static final void b(o02 o02Var, q12 q12Var, g30 g30Var, int i) {
                int i2;
                j30 j30VarQ = g30Var.q(3173830);
                if ((i & 14) == 0) {
                    i2 = (j30VarQ.I(o02Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 112) == 0) {
                    i2 |= j30VarQ.I(q12Var) ? 32 : 16;
                }
                if ((i2 & 91) == 18 && j30VarQ.t()) {
                    j30VarQ.x();
                } else if (o02Var.g() > 0) {
                    q12Var.j(o02Var);
                }
                tk3 tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(o02Var, q12Var, i);
            }
        }
