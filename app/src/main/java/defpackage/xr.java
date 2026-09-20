package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xr {

    public static final class CQf extends cx1 implements j81<o55, sd5> {
        public final /* synthetic */ ri2<o55> w;
        public final /* synthetic */ j81<o55, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(ri2<o55> ri2Var, j81<? super o55, sd5> j81Var) {
            super(1);
            this.w = ri2Var;
            this.x = j81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(o55 o55Var) {
            o55 o55Var2 = o55Var;
            this.w.setValue(o55Var2);
            this.x.invoke(o55Var2);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ j81<o55, sd5> C;
        public final /* synthetic */ j81<Integer, sd5> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;
        public final /* synthetic */ Z7jl w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ w55 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(Z7jl z7jl, pg2 pg2Var, w55 w55Var, boolean z, int i, int i2, j81<? super o55, sd5> j81Var, j81<? super Integer, sd5> j81Var2, int i3, int i4) {
            super(2);
            this.w = z7jl;
            this.x = pg2Var;
            this.y = w55Var;
            this.z = z;
            this.A = i;
            this.B = i2;
            this.C = j81Var;
            this.D = j81Var2;
            this.E = i3;
            this.F = i4;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            xr.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, g30Var, this.E | 1, this.F);
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", l = {76}, m = "invokeSuspend")
    public static final class LPt8Fixed extends px4 implements x81<l93, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ ri2<o55> C;
        public final /* synthetic */ j81<Integer, sd5> D;

        public static final class QnHx extends cx1 implements j81<kt2, sd5> {
            public final /* synthetic */ ri2<o55> w;
            public final /* synthetic */ j81<Integer, sd5> x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public QnHx(ri2<o55> ri2Var, j81<? super Integer, sd5> j81Var) {
                super(1);
                this.w = ri2Var;
                this.x = j81Var;
            }

            @Override // defpackage.j81
            public final sd5 invoke(kt2 kt2Var) {
                long j = kt2Var.a;
                o55 value = this.w.getValue();
                if (value != null) {
                    this.x.invoke(Integer.valueOf(value.l(j)));
                }
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(ri2<o55> ri2Var, j81<? super Integer, sd5> j81Var, z80<? super LPt8Fixed> z80Var) {
            super(2, z80Var);
            this.C = ri2Var;
            this.D = j81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            LPt8Fixed lPt8 = new LPt8Fixed(this.C, this.D, z80Var);
            lPt8.B = obj;
            return lPt8;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                l93 l93Var = (l93) this.B;
                QnHx qnHx = new QnHx(this.C, this.D);
                this.A = 1;
                if (p05.d(l93Var, null, qnHx, this, 7) == va0Var) {
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
        public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
            return ((LPt8Fixed) a(l93Var, z80Var)).i(sd5.a);
        }
    }

    public static final class QnHx extends cx1 implements j81<o55, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(o55 o55Var) {
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x0139  */
    /* JADX WARN: Code duplicated, block: B:114:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x016f  */
    /* JADX WARN: Code duplicated, block: B:121:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x019c  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    public static final void a(Z7jl z7jl, pg2 pg2Var, w55 w55Var, boolean z, int i, int i2, j81<? super o55, sd5> j81Var, j81<? super Integer, sd5> j81Var2, g30 g30Var, int i3, int i4) {
        int i5;
        int i6;
        w55 w55Var2;
        int i7;
        int i8;
        boolean z2;
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
        pg2.QnHx qnHx;
        pg2 pg2Var2;
        boolean z3;
        int i19;
        j81<? super o55, sd5> j81Var3;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        ri2 ri2Var;
        boolean zI;
        Object objB1;
        boolean zI2;
        Object objB2;
        pg2 pg2Var3;
        w55 w55Var3;
        int i20;
        j81<? super o55, sd5> j81Var4;
        int i21;
        boolean z4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-246609449);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (j30VarQ.I(z7jl) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i22 = i4 & 2;
        if (i22 == 0) {
            if ((i3 & 112) == 0) {
                i5 |= j30VarQ.I(pg2Var) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 896) == 0) {
                    w55Var2 = w55Var;
                    if (j30VarQ.I(w55Var2)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 7168) == 0) {
                        z2 = z;
                        if (j30VarQ.c(z2)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 57344) == 0) {
                            i11 = i;
                            if (j30VarQ.i(i11)) {
                                i12 = 16384;
                            } else {
                                i12 = 8192;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 32;
                        if (i13 != 0) {
                            i5 |= 196608;
                            i14 = i2;
                        } else {
                            i14 = i2;
                            if ((i3 & 458752) == 0) {
                                if (j30VarQ.i(i14)) {
                                    i15 = 131072;
                                } else {
                                    i15 = 65536;
                                }
                                i5 |= i15;
                            }
                        }
                        i16 = i4 & 64;
                        if (i16 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            if (j30VarQ.I(j81Var)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i5 |= i17;
                        }
                        if ((i4 & 128) != 0) {
                            if ((29360128 & i3) == 0) {
                                if (j30VarQ.I(j81Var2)) {
                                    i18 = 8388608;
                                } else {
                                    i18 = 4194304;
                                }
                            }
                            if ((23967451 & i5) == 4793490 || !j30VarQ.t()) {
                                qnHx = pg2.QnHx.w;
                                if (i22 != 0) {
                                    pg2Var2 = qnHx;
                                } else {
                                    pg2Var2 = pg2Var;
                                }
                                if (i6 != 0) {
                                    w55Var2 = w55.d;
                                }
                                if (i8 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                int i23 = i10 == 0 ? i11 : 1;
                                if (i13 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                } else {
                                    i19 = i14;
                                }
                                if (i16 != 0) {
                                    j81Var3 = QnHx.w;
                                } else {
                                    j81Var3 = j81Var;
                                }
                                j30VarQ.e(-492369756);
                                objB0 = j30VarQ.b0();
                                c0132QnHx = g30.QnHx.a;
                                if (objB0 == c0132QnHx) {
                                    objB0 = ps0.R(null);
                                    j30VarQ.F0(objB0);
                                }
                                j30VarQ.R(false);
                                ri2Var = (ri2) objB0;
                                j30VarQ.e(511388516);
                                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                                objB1 = j30VarQ.b0();
                                if (zI || objB1 == c0132QnHx) {
                                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                    j30VarQ.F0(objB1);
                                }
                                j30VarQ.R(false);
                                pg2 pg2VarY = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                                j30VarQ.e(511388516);
                                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                                objB2 = j30VarQ.b0();
                                if (zI2 || objB2 == c0132QnHx) {
                                    objB2 = new CQf(ri2Var, j81Var3);
                                    j30VarQ.F0(objB2);
                                }
                                j30VarQ.R(false);
                                i9.a(z7jl, pg2VarY, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                                pg2Var3 = pg2Var2;
                                w55Var3 = w55Var2;
                                i20 = i19;
                                j81Var4 = j81Var3;
                                boolean z5 = z3;
                                i21 = i23;
                                z4 = z5;
                            } else {
                                j30VarQ.x();
                                pg2Var3 = pg2Var;
                                j81Var4 = j81Var;
                                w55Var3 = w55Var2;
                                z4 = z2;
                                i20 = i14;
                                i21 = i11;
                            }
                            tk3VarU = j30VarQ.U();
                            if (tk3VarU == null) {
                                return;
                            }
                            tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                        }
                        i18 = 12582912;
                        i5 |= i18;
                        if ((23967451 & i5) == 4793490) {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY2 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY2, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z6 = z3;
                            i21 = i23;
                            z4 = z6;
                        } else {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY3 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY3, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z7 = z3;
                            i21 = i23;
                            z4 = z7;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                    }
                    i5 |= 24576;
                    i11 = i;
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                        i14 = i2;
                    } else {
                        i14 = i2;
                        if ((i3 & 458752) == 0) {
                            if (j30VarQ.i(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 64;
                    if (i16 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        if (j30VarQ.I(j81Var)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & 128) != 0) {
                        if ((29360128 & i3) == 0) {
                            if (j30VarQ.I(j81Var2)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                        }
                        if ((23967451 & i5) == 4793490) {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY4 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY4, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z8 = z3;
                            i21 = i23;
                            z4 = z8;
                        } else {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY5 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY5, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z9 = z3;
                            i21 = i23;
                            z4 = z9;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                    }
                    i18 = 12582912;
                    i5 |= i18;
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY6 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY6, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z10 = z3;
                        i21 = i23;
                        z4 = z10;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY7 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY7, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z11 = z3;
                        i21 = i23;
                        z4 = z11;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i5 |= 3072;
                z2 = z;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 57344) == 0) {
                        i11 = i;
                        if (j30VarQ.i(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                        i14 = i2;
                    } else {
                        i14 = i2;
                        if ((i3 & 458752) == 0) {
                            if (j30VarQ.i(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 64;
                    if (i16 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        if (j30VarQ.I(j81Var)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & 128) != 0) {
                        if ((29360128 & i3) == 0) {
                            if (j30VarQ.I(j81Var2)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                        }
                        if ((23967451 & i5) == 4793490) {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY8 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY8, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z12 = z3;
                            i21 = i23;
                            z4 = z12;
                        } else {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY9 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY9, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z13 = z3;
                            i21 = i23;
                            z4 = z13;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                    }
                    i18 = 12582912;
                    i5 |= i18;
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY10 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY10, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z14 = z3;
                        i21 = i23;
                        z4 = z14;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY11 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY11, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z15 = z3;
                        i21 = i23;
                        z4 = z15;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 458752) == 0) {
                        if (j30VarQ.i(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (j30VarQ.I(j81Var)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (j30VarQ.I(j81Var2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY12 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY12, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z16 = z3;
                        i21 = i23;
                        z4 = z16;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY13 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY13, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z17 = z3;
                        i21 = i23;
                        z4 = z17;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i18 = 12582912;
                i5 |= i18;
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY14 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY14, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z18 = z3;
                    i21 = i23;
                    z4 = z18;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY15 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY15, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z19 = z3;
                    i21 = i23;
                    z4 = z19;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i5 |= 384;
            w55Var2 = w55Var;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    z2 = z;
                    if (j30VarQ.c(z2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 57344) == 0) {
                        i11 = i;
                        if (j30VarQ.i(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                        i14 = i2;
                    } else {
                        i14 = i2;
                        if ((i3 & 458752) == 0) {
                            if (j30VarQ.i(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 64;
                    if (i16 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        if (j30VarQ.I(j81Var)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & 128) != 0) {
                        if ((29360128 & i3) == 0) {
                            if (j30VarQ.I(j81Var2)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                        }
                        if ((23967451 & i5) == 4793490) {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY16 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY16, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z110 = z3;
                            i21 = i23;
                            z4 = z110;
                        } else {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY17 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY17, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z111 = z3;
                            i21 = i23;
                            z4 = z111;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                    }
                    i18 = 12582912;
                    i5 |= i18;
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY18 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY18, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z112 = z3;
                        i21 = i23;
                        z4 = z112;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY19 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY19, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z113 = z3;
                        i21 = i23;
                        z4 = z113;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 458752) == 0) {
                        if (j30VarQ.i(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (j30VarQ.I(j81Var)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (j30VarQ.I(j81Var2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY110 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY110, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z114 = z3;
                        i21 = i23;
                        z4 = z114;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY111 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY111, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z115 = z3;
                        i21 = i23;
                        z4 = z115;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i18 = 12582912;
                i5 |= i18;
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY112 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY112, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z116 = z3;
                    i21 = i23;
                    z4 = z116;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY113 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY113, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z117 = z3;
                    i21 = i23;
                    z4 = z117;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i5 |= 3072;
            z2 = z;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 57344) == 0) {
                    i11 = i;
                    if (j30VarQ.i(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 458752) == 0) {
                        if (j30VarQ.i(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (j30VarQ.I(j81Var)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (j30VarQ.I(j81Var2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY114 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY114, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z118 = z3;
                        i21 = i23;
                        z4 = z118;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY115 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY115, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z119 = z3;
                        i21 = i23;
                        z4 = z119;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i18 = 12582912;
                i5 |= i18;
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY116 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY116, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z1110 = z3;
                    i21 = i23;
                    z4 = z1110;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY117 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY117, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z1111 = z3;
                    i21 = i23;
                    z4 = z1111;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
                i14 = i2;
            } else {
                i14 = i2;
                if ((i3 & 458752) == 0) {
                    if (j30VarQ.i(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 64;
            if (i16 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (j30VarQ.I(j81Var)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i5 |= i17;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (j30VarQ.I(j81Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY118 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY118, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z1112 = z3;
                    i21 = i23;
                    z4 = z1112;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY119 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY119, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z1113 = z3;
                    i21 = i23;
                    z4 = z1113;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i18 = 12582912;
            i5 |= i18;
            if ((23967451 & i5) == 4793490) {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY1110 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY1110, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z1114 = z3;
                i21 = i23;
                z4 = z1114;
            } else {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY1111 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY1111, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z1115 = z3;
                i21 = i23;
                z4 = z1115;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
        }
        i5 |= 48;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 896) == 0) {
                w55Var2 = w55Var;
                if (j30VarQ.I(w55Var2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    z2 = z;
                    if (j30VarQ.c(z2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 57344) == 0) {
                        i11 = i;
                        if (j30VarQ.i(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                        i14 = i2;
                    } else {
                        i14 = i2;
                        if ((i3 & 458752) == 0) {
                            if (j30VarQ.i(i14)) {
                                i15 = 131072;
                            } else {
                                i15 = 65536;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 64;
                    if (i16 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        if (j30VarQ.I(j81Var)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & 128) != 0) {
                        if ((29360128 & i3) == 0) {
                            if (j30VarQ.I(j81Var2)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                        }
                        if ((23967451 & i5) == 4793490) {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY1112 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY1112, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z1116 = z3;
                            i21 = i23;
                            z4 = z1116;
                        } else {
                            qnHx = pg2.QnHx.w;
                            if (i22 != 0) {
                                pg2Var2 = qnHx;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if (i6 != 0) {
                                w55Var2 = w55.d;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 == 0) {
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                j81Var3 = QnHx.w;
                            } else {
                                j81Var3 = j81Var;
                            }
                            j30VarQ.e(-492369756);
                            objB0 = j30VarQ.b0();
                            c0132QnHx = g30.QnHx.a;
                            if (objB0 == c0132QnHx) {
                                objB0 = ps0.R(null);
                                j30VarQ.F0(objB0);
                            }
                            j30VarQ.R(false);
                            ri2Var = (ri2) objB0;
                            j30VarQ.e(511388516);
                            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                            objB1 = j30VarQ.b0();
                            if (zI) {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            } else {
                                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                                j30VarQ.F0(objB1);
                            }
                            j30VarQ.R(false);
                            pg2 pg2VarY1113 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                            j30VarQ.e(511388516);
                            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                            objB2 = j30VarQ.b0();
                            if (zI2) {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            } else {
                                objB2 = new CQf(ri2Var, j81Var3);
                                j30VarQ.F0(objB2);
                            }
                            j30VarQ.R(false);
                            i9.a(z7jl, pg2VarY1113, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                            pg2Var3 = pg2Var2;
                            w55Var3 = w55Var2;
                            i20 = i19;
                            j81Var4 = j81Var3;
                            boolean z1117 = z3;
                            i21 = i23;
                            z4 = z1117;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                    }
                    i18 = 12582912;
                    i5 |= i18;
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY1114 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY1114, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z1118 = z3;
                        i21 = i23;
                        z4 = z1118;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY1115 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY1115, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z1119 = z3;
                        i21 = i23;
                        z4 = z1119;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 458752) == 0) {
                        if (j30VarQ.i(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (j30VarQ.I(j81Var)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (j30VarQ.I(j81Var2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY1116 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY1116, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z11110 = z3;
                        i21 = i23;
                        z4 = z11110;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY1117 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY1117, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z11111 = z3;
                        i21 = i23;
                        z4 = z11111;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i18 = 12582912;
                i5 |= i18;
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY1118 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY1118, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z11112 = z3;
                    i21 = i23;
                    z4 = z11112;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY1119 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY1119, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z11113 = z3;
                    i21 = i23;
                    z4 = z11113;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i5 |= 3072;
            z2 = z;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 57344) == 0) {
                    i11 = i;
                    if (j30VarQ.i(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 458752) == 0) {
                        if (j30VarQ.i(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (j30VarQ.I(j81Var)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (j30VarQ.I(j81Var2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY11110 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY11110, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z11114 = z3;
                        i21 = i23;
                        z4 = z11114;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY11111 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY11111, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z11115 = z3;
                        i21 = i23;
                        z4 = z11115;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i18 = 12582912;
                i5 |= i18;
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY11112 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY11112, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z11116 = z3;
                    i21 = i23;
                    z4 = z11116;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY11113 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY11113, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z11117 = z3;
                    i21 = i23;
                    z4 = z11117;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
                i14 = i2;
            } else {
                i14 = i2;
                if ((i3 & 458752) == 0) {
                    if (j30VarQ.i(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 64;
            if (i16 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (j30VarQ.I(j81Var)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i5 |= i17;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (j30VarQ.I(j81Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY11114 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY11114, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z11118 = z3;
                    i21 = i23;
                    z4 = z11118;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY11115 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY11115, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z11119 = z3;
                    i21 = i23;
                    z4 = z11119;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i18 = 12582912;
            i5 |= i18;
            if ((23967451 & i5) == 4793490) {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY11116 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY11116, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z111110 = z3;
                i21 = i23;
                z4 = z111110;
            } else {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY11117 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY11117, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z111111 = z3;
                i21 = i23;
                z4 = z111111;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
        }
        i5 |= 384;
        w55Var2 = w55Var;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 7168) == 0) {
                z2 = z;
                if (j30VarQ.c(z2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 57344) == 0) {
                    i11 = i;
                    if (j30VarQ.i(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 458752) == 0) {
                        if (j30VarQ.i(i14)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 64;
                if (i16 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (j30VarQ.I(j81Var)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i5 |= i17;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (j30VarQ.I(j81Var2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY11118 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY11118, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z111112 = z3;
                        i21 = i23;
                        z4 = z111112;
                    } else {
                        qnHx = pg2.QnHx.w;
                        if (i22 != 0) {
                            pg2Var2 = qnHx;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if (i6 != 0) {
                            w55Var2 = w55.d;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 == 0) {
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            j81Var3 = QnHx.w;
                        } else {
                            j81Var3 = j81Var;
                        }
                        j30VarQ.e(-492369756);
                        objB0 = j30VarQ.b0();
                        c0132QnHx = g30.QnHx.a;
                        if (objB0 == c0132QnHx) {
                            objB0 = ps0.R(null);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        ri2Var = (ri2) objB0;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                        objB1 = j30VarQ.b0();
                        if (zI) {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        } else {
                            objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarY11119 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                        objB2 = j30VarQ.b0();
                        if (zI2) {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        } else {
                            objB2 = new CQf(ri2Var, j81Var3);
                            j30VarQ.F0(objB2);
                        }
                        j30VarQ.R(false);
                        i9.a(z7jl, pg2VarY11119, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                        pg2Var3 = pg2Var2;
                        w55Var3 = w55Var2;
                        i20 = i19;
                        j81Var4 = j81Var3;
                        boolean z111113 = z3;
                        i21 = i23;
                        z4 = z111113;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
                }
                i18 = 12582912;
                i5 |= i18;
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY111110 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY111110, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z111114 = z3;
                    i21 = i23;
                    z4 = z111114;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY111111 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY111111, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z111115 = z3;
                    i21 = i23;
                    z4 = z111115;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
                i14 = i2;
            } else {
                i14 = i2;
                if ((i3 & 458752) == 0) {
                    if (j30VarQ.i(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 64;
            if (i16 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (j30VarQ.I(j81Var)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i5 |= i17;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (j30VarQ.I(j81Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY111112 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY111112, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z111116 = z3;
                    i21 = i23;
                    z4 = z111116;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY111113 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY111113, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z111117 = z3;
                    i21 = i23;
                    z4 = z111117;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i18 = 12582912;
            i5 |= i18;
            if ((23967451 & i5) == 4793490) {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY111114 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY111114, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z111118 = z3;
                i21 = i23;
                z4 = z111118;
            } else {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY111115 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY111115, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z111119 = z3;
                i21 = i23;
                z4 = z111119;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
        }
        i5 |= 3072;
        z2 = z;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 57344) == 0) {
                i11 = i;
                if (j30VarQ.i(i11)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i5 |= i12;
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
                i14 = i2;
            } else {
                i14 = i2;
                if ((i3 & 458752) == 0) {
                    if (j30VarQ.i(i14)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 64;
            if (i16 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (j30VarQ.I(j81Var)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i5 |= i17;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (j30VarQ.I(j81Var2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY111116 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY111116, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z1111110 = z3;
                    i21 = i23;
                    z4 = z1111110;
                } else {
                    qnHx = pg2.QnHx.w;
                    if (i22 != 0) {
                        pg2Var2 = qnHx;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i6 != 0) {
                        w55Var2 = w55.d;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 == 0) {
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        j81Var3 = QnHx.w;
                    } else {
                        j81Var3 = j81Var;
                    }
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    c0132QnHx = g30.QnHx.a;
                    if (objB0 == c0132QnHx) {
                        objB0 = ps0.R(null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    ri2Var = (ri2) objB0;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    pg2 pg2VarY111117 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                    objB2 = j30VarQ.b0();
                    if (zI2) {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    } else {
                        objB2 = new CQf(ri2Var, j81Var3);
                        j30VarQ.F0(objB2);
                    }
                    j30VarQ.R(false);
                    i9.a(z7jl, pg2VarY111117, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                    pg2Var3 = pg2Var2;
                    w55Var3 = w55Var2;
                    i20 = i19;
                    j81Var4 = j81Var3;
                    boolean z1111111 = z3;
                    i21 = i23;
                    z4 = z1111111;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
            }
            i18 = 12582912;
            i5 |= i18;
            if ((23967451 & i5) == 4793490) {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY111118 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY111118, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z1111112 = z3;
                i21 = i23;
                z4 = z1111112;
            } else {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY111119 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY111119, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z1111113 = z3;
                i21 = i23;
                z4 = z1111113;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
        }
        i5 |= 24576;
        i11 = i;
        i13 = i4 & 32;
        if (i13 != 0) {
            i5 |= 196608;
            i14 = i2;
        } else {
            i14 = i2;
            if ((i3 & 458752) == 0) {
                if (j30VarQ.i(i14)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i5 |= i15;
            }
        }
        i16 = i4 & 64;
        if (i16 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (j30VarQ.I(j81Var)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i5 |= i17;
        }
        if ((i4 & 128) != 0) {
            if ((29360128 & i3) == 0) {
                if (j30VarQ.I(j81Var2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
            }
            if ((23967451 & i5) == 4793490) {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY1111110 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY1111110, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z1111114 = z3;
                i21 = i23;
                z4 = z1111114;
            } else {
                qnHx = pg2.QnHx.w;
                if (i22 != 0) {
                    pg2Var2 = qnHx;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i6 != 0) {
                    w55Var2 = w55.d;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 == 0) {
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    j81Var3 = QnHx.w;
                } else {
                    j81Var3 = j81Var;
                }
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                j30VarQ.e(511388516);
                zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                pg2 pg2VarY1111111 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
                j30VarQ.e(511388516);
                zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
                objB2 = j30VarQ.b0();
                if (zI2) {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                } else {
                    objB2 = new CQf(ri2Var, j81Var3);
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                i9.a(z7jl, pg2VarY1111111, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
                pg2Var3 = pg2Var2;
                w55Var3 = w55Var2;
                i20 = i19;
                j81Var4 = j81Var3;
                boolean z1111115 = z3;
                i21 = i23;
                z4 = z1111115;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
        }
        i18 = 12582912;
        i5 |= i18;
        if ((23967451 & i5) == 4793490) {
            qnHx = pg2.QnHx.w;
            if (i22 != 0) {
                pg2Var2 = qnHx;
            } else {
                pg2Var2 = pg2Var;
            }
            if (i6 != 0) {
                w55Var2 = w55.d;
            }
            if (i8 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i10 == 0) {
            }
            if (i13 != 0) {
                i19 = Integer.MAX_VALUE;
            } else {
                i19 = i14;
            }
            if (i16 != 0) {
                j81Var3 = QnHx.w;
            } else {
                j81Var3 = j81Var;
            }
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(null);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2Var = (ri2) objB0;
            j30VarQ.e(511388516);
            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
            objB1 = j30VarQ.b0();
            if (zI) {
                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                j30VarQ.F0(objB1);
            } else {
                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            pg2 pg2VarY1111112 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
            j30VarQ.e(511388516);
            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
            objB2 = j30VarQ.b0();
            if (zI2) {
                objB2 = new CQf(ri2Var, j81Var3);
                j30VarQ.F0(objB2);
            } else {
                objB2 = new CQf(ri2Var, j81Var3);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            i9.a(z7jl, pg2VarY1111112, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
            pg2Var3 = pg2Var2;
            w55Var3 = w55Var2;
            i20 = i19;
            j81Var4 = j81Var3;
            boolean z1111116 = z3;
            i21 = i23;
            z4 = z1111116;
        } else {
            qnHx = pg2.QnHx.w;
            if (i22 != 0) {
                pg2Var2 = qnHx;
            } else {
                pg2Var2 = pg2Var;
            }
            if (i6 != 0) {
                w55Var2 = w55.d;
            }
            if (i8 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i10 == 0) {
            }
            if (i13 != 0) {
                i19 = Integer.MAX_VALUE;
            } else {
                i19 = i14;
            }
            if (i16 != 0) {
                j81Var3 = QnHx.w;
            } else {
                j81Var3 = j81Var;
            }
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(null);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2Var = (ri2) objB0;
            j30VarQ.e(511388516);
            zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var2);
            objB1 = j30VarQ.b0();
            if (zI) {
                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                j30VarQ.F0(objB1);
            } else {
                objB1 = new LPt8Fixed(ri2Var, j81Var2, null);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            pg2 pg2VarY1111113 = pg2Var2.y(tx4.a(qnHx, j81Var2, (x81) objB1));
            j30VarQ.e(511388516);
            zI2 = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var3);
            objB2 = j30VarQ.b0();
            if (zI2) {
                objB2 = new CQf(ri2Var, j81Var3);
                j30VarQ.F0(objB2);
            } else {
                objB2 = new CQf(ri2Var, j81Var3);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            i9.a(z7jl, pg2VarY1111113, w55Var2, (j81) objB2, i23, z3, i19, null, j30VarQ, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 128);
            pg2Var3 = pg2Var2;
            w55Var3 = w55Var2;
            i20 = i19;
            j81Var4 = j81Var3;
            boolean z1111117 = z3;
            i21 = i23;
            z4 = z1111117;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(z7jl, pg2Var3, w55Var3, z4, i21, i20, j81Var4, j81Var2, i3, i4);
    }
}
