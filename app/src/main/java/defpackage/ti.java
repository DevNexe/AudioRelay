package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ti {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ String x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ pg2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(h81<sd5> h81Var, String str, boolean z, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = h81Var;
            this.x = str;
            this.y = z;
            this.z = pg2Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ti.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<wu3, g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(String str, int i) {
            super(3);
            this.w = str;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                j55.b(this.w, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, (this.x >> 3) & 14, 0, 65534);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ String x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ pg2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(h81<sd5> h81Var, String str, boolean z, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = h81Var;
            this.x = str;
            this.y = z;
            this.z = pg2Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ti.d(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wu3, g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(String str, int i) {
            super(3);
            this.w = str;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                j55.b(this.w, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, (this.x >> 3) & 14, 0, 65534);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void a(int i, int i2, g30 g30Var, pg2 pg2Var, h81 h81Var, y81 y81Var, boolean z) {
        int i3;
        boolean z2;
        int i4;
        pg2 pg2Var2;
        int i5;
        int i6;
        boolean z3;
        pg2 pg2Var3;
        boolean z4;
        pg2 pg2Var4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1065499621);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= j30VarQ.c(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    pg2Var2 = pg2Var;
                    if (j30VarQ.I(pg2Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                    if (i7 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    e40.CQf cQf = e40.a;
                    si.b(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, X.m(j30VarQ, 1332134835, new vi(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                    z4 = z3;
                    pg2Var4 = pg2Var3;
                } else {
                    j30VarQ.x();
                    pg2Var4 = pg2Var2;
                    z4 = z2;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new wi(i, i2, pg2Var4, h81Var, y81Var, z4);
            }
            i3 |= 384;
            pg2Var2 = pg2Var;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf2 = e40.a;
                si.b(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, X.m(j30VarQ, 1332134835, new vi(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                z4 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf3 = e40.a;
                si.b(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, X.m(j30VarQ, 1332134835, new vi(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                z4 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new wi(i, i2, pg2Var4, h81Var, y81Var, z4);
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                pg2Var2 = pg2Var;
                if (j30VarQ.I(pg2Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf4 = e40.a;
                si.b(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, X.m(j30VarQ, 1332134835, new vi(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                z4 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf5 = e40.a;
                si.b(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, X.m(j30VarQ, 1332134835, new vi(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                z4 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new wi(i, i2, pg2Var4, h81Var, y81Var, z4);
        }
        i3 |= 384;
        pg2Var2 = pg2Var;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(y81Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170) {
            if (i7 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf6 = e40.a;
            si.b(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, X.m(j30VarQ, 1332134835, new vi(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
            z4 = z3;
            pg2Var4 = pg2Var3;
        } else {
            if (i7 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf7 = e40.a;
            si.b(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, X.m(j30VarQ, 1332134835, new vi(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
            z4 = z3;
            pg2Var4 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new wi(i, i2, pg2Var4, h81Var, y81Var, z4);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void b(h81<sd5> h81Var, String str, boolean z, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        pg2 pg2Var2;
        int i5;
        boolean z3;
        pg2 pg2Var3;
        boolean z4;
        pg2 pg2Var4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-418264351);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                z2 = z;
                i3 |= j30VarQ.c(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    pg2Var2 = pg2Var;
                    if (j30VarQ.I(pg2Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    e40.CQf cQf = e40.a;
                    sz szVarM = X.m(j30VarQ, -931171684, new QnHx(str, i3));
                    int i7 = (i3 & 14) | 3072;
                    int i8 = i3 >> 3;
                    a(i7 | (i8 & 112) | (i8 & 896), 0, j30VarQ, pg2Var3, h81Var, szVarM, z3);
                    z4 = z3;
                    pg2Var4 = pg2Var3;
                } else {
                    j30VarQ.x();
                    z4 = z2;
                    pg2Var4 = pg2Var2;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new CQf(h81Var, str, z4, pg2Var4, i, i2);
            }
            i3 |= 3072;
            pg2Var2 = pg2Var;
            if ((i3 & 5851) == 1170) {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf2 = e40.a;
                sz szVarM2 = X.m(j30VarQ, -931171684, new QnHx(str, i3));
                int i9 = (i3 & 14) | 3072;
                int i10 = i3 >> 3;
                a(i9 | (i10 & 112) | (i10 & 896), 0, j30VarQ, pg2Var3, h81Var, szVarM2, z3);
                z4 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf3 = e40.a;
                sz szVarM3 = X.m(j30VarQ, -931171684, new QnHx(str, i3));
                int i11 = (i3 & 14) | 3072;
                int i12 = i3 >> 3;
                a(i11 | (i12 & 112) | (i12 & 896), 0, j30VarQ, pg2Var3, h81Var, szVarM3, z3);
                z4 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(h81Var, str, z4, pg2Var4, i, i2);
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                pg2Var2 = pg2Var;
                if (j30VarQ.I(pg2Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf4 = e40.a;
                sz szVarM4 = X.m(j30VarQ, -931171684, new QnHx(str, i3));
                int i13 = (i3 & 14) | 3072;
                int i14 = i3 >> 3;
                a(i13 | (i14 & 112) | (i14 & 896), 0, j30VarQ, pg2Var3, h81Var, szVarM4, z3);
                z4 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf5 = e40.a;
                sz szVarM5 = X.m(j30VarQ, -931171684, new QnHx(str, i3));
                int i15 = (i3 & 14) | 3072;
                int i16 = i3 >> 3;
                a(i15 | (i16 & 112) | (i16 & 896), 0, j30VarQ, pg2Var3, h81Var, szVarM5, z3);
                z4 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new CQf(h81Var, str, z4, pg2Var4, i, i2);
        }
        i3 |= 3072;
        pg2Var2 = pg2Var;
        if ((i3 & 5851) == 1170) {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf6 = e40.a;
            sz szVarM6 = X.m(j30VarQ, -931171684, new QnHx(str, i3));
            int i17 = (i3 & 14) | 3072;
            int i18 = i3 >> 3;
            a(i17 | (i18 & 112) | (i18 & 896), 0, j30VarQ, pg2Var3, h81Var, szVarM6, z3);
            z4 = z3;
            pg2Var4 = pg2Var3;
        } else {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf7 = e40.a;
            sz szVarM7 = X.m(j30VarQ, -931171684, new QnHx(str, i3));
            int i19 = (i3 & 14) | 3072;
            int i110 = i3 >> 3;
            a(i19 | (i110 & 112) | (i110 & 896), 0, j30VarQ, pg2Var3, h81Var, szVarM7, z3);
            z4 = z3;
            pg2Var4 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(h81Var, str, z4, pg2Var4, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void c(int i, int i2, g30 g30Var, pg2 pg2Var, h81 h81Var, y81 y81Var, boolean z) {
        int i3;
        pg2 pg2Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        pg2 pg2Var3;
        boolean z3;
        pg2 pg2Var4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1375684191);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z2 = z;
                    if (j30VarQ.c(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    e40.CQf cQf = e40.a;
                    si.a(h81Var, fTO$.h(mw1.a(pg2Var3, h81Var), j30VarQ), z3, null, null, null, null, null, null, X.m(j30VarQ, -148108911, new yi(y81Var, i3)), j30VarQ, 805306368 | (i3 & 14) | (i3 & 896), 504);
                    z2 = z3;
                    pg2Var4 = pg2Var3;
                } else {
                    j30VarQ.x();
                    pg2Var4 = pg2Var2;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new zi(i, i2, pg2Var4, h81Var, y81Var, z2);
            }
            i3 |= 384;
            z2 = z;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                e40.CQf cQf2 = e40.a;
                si.a(h81Var, fTO$.h(mw1.a(pg2Var3, h81Var), j30VarQ), z3, null, null, null, null, null, null, X.m(j30VarQ, -148108911, new yi(y81Var, i3)), j30VarQ, 805306368 | (i3 & 14) | (i3 & 896), 504);
                z2 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                e40.CQf cQf3 = e40.a;
                si.a(h81Var, fTO$.h(mw1.a(pg2Var3, h81Var), j30VarQ), z3, null, null, null, null, null, null, X.m(j30VarQ, -148108911, new yi(y81Var, i3)), j30VarQ, 805306368 | (i3 & 14) | (i3 & 896), 504);
                z2 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new zi(i, i2, pg2Var4, h81Var, y81Var, z2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z2 = z;
                if (j30VarQ.c(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                e40.CQf cQf4 = e40.a;
                si.a(h81Var, fTO$.h(mw1.a(pg2Var3, h81Var), j30VarQ), z3, null, null, null, null, null, null, X.m(j30VarQ, -148108911, new yi(y81Var, i3)), j30VarQ, 805306368 | (i3 & 14) | (i3 & 896), 504);
                z2 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                e40.CQf cQf5 = e40.a;
                si.a(h81Var, fTO$.h(mw1.a(pg2Var3, h81Var), j30VarQ), z3, null, null, null, null, null, null, X.m(j30VarQ, -148108911, new yi(y81Var, i3)), j30VarQ, 805306368 | (i3 & 14) | (i3 & 896), 504);
                z2 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new zi(i, i2, pg2Var4, h81Var, y81Var, z2);
        }
        i3 |= 384;
        z2 = z;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(y81Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170) {
            if (i7 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            e40.CQf cQf6 = e40.a;
            si.a(h81Var, fTO$.h(mw1.a(pg2Var3, h81Var), j30VarQ), z3, null, null, null, null, null, null, X.m(j30VarQ, -148108911, new yi(y81Var, i3)), j30VarQ, 805306368 | (i3 & 14) | (i3 & 896), 504);
            z2 = z3;
            pg2Var4 = pg2Var3;
        } else {
            if (i7 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            e40.CQf cQf7 = e40.a;
            si.a(h81Var, fTO$.h(mw1.a(pg2Var3, h81Var), j30VarQ), z3, null, null, null, null, null, null, X.m(j30VarQ, -148108911, new yi(y81Var, i3)), j30VarQ, 805306368 | (i3 & 14) | (i3 & 896), 504);
            z2 = z3;
            pg2Var4 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new zi(i, i2, pg2Var4, h81Var, y81Var, z2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void d(h81<sd5> h81Var, String str, boolean z, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        pg2 pg2Var2;
        int i5;
        boolean z3;
        pg2 pg2Var3;
        boolean z4;
        pg2 pg2Var4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(181310429);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                z2 = z;
                i3 |= j30VarQ.c(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    pg2Var2 = pg2Var;
                    if (j30VarQ.I(pg2Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    e40.CQf cQf = e40.a;
                    c((i3 & 14) | 3072 | ((i3 >> 6) & 112) | (i3 & 896), 0, j30VarQ, pg2Var3, h81Var, X.m(j30VarQ, -1521185676, new F1(str, i3)), z3);
                    z4 = z3;
                    pg2Var4 = pg2Var3;
                } else {
                    j30VarQ.x();
                    z4 = z2;
                    pg2Var4 = pg2Var2;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(h81Var, str, z4, pg2Var4, i, i2);
            }
            i3 |= 3072;
            pg2Var2 = pg2Var;
            if ((i3 & 5851) == 1170) {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf2 = e40.a;
                c((i3 & 14) | 3072 | ((i3 >> 6) & 112) | (i3 & 896), 0, j30VarQ, pg2Var3, h81Var, X.m(j30VarQ, -1521185676, new F1(str, i3)), z3);
                z4 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf3 = e40.a;
                c((i3 & 14) | 3072 | ((i3 >> 6) & 112) | (i3 & 896), 0, j30VarQ, pg2Var3, h81Var, X.m(j30VarQ, -1521185676, new F1(str, i3)), z3);
                z4 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(h81Var, str, z4, pg2Var4, i, i2);
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                pg2Var2 = pg2Var;
                if (j30VarQ.I(pg2Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf4 = e40.a;
                c((i3 & 14) | 3072 | ((i3 >> 6) & 112) | (i3 & 896), 0, j30VarQ, pg2Var3, h81Var, X.m(j30VarQ, -1521185676, new F1(str, i3)), z3);
                z4 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf5 = e40.a;
                c((i3 & 14) | 3072 | ((i3 >> 6) & 112) | (i3 & 896), 0, j30VarQ, pg2Var3, h81Var, X.m(j30VarQ, -1521185676, new F1(str, i3)), z3);
                z4 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(h81Var, str, z4, pg2Var4, i, i2);
        }
        i3 |= 3072;
        pg2Var2 = pg2Var;
        if ((i3 & 5851) == 1170) {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf6 = e40.a;
            c((i3 & 14) | 3072 | ((i3 >> 6) & 112) | (i3 & 896), 0, j30VarQ, pg2Var3, h81Var, X.m(j30VarQ, -1521185676, new F1(str, i3)), z3);
            z4 = z3;
            pg2Var4 = pg2Var3;
        } else {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf7 = e40.a;
            c((i3 & 14) | 3072 | ((i3 >> 6) & 112) | (i3 & 896), 0, j30VarQ, pg2Var3, h81Var, X.m(j30VarQ, -1521185676, new F1(str, i3)), z3);
            z4 = z3;
            pg2Var4 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(h81Var, str, z4, pg2Var4, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void e(int i, int i2, g30 g30Var, pg2 pg2Var, h81 h81Var, y81 y81Var, boolean z) {
        int i3;
        boolean z2;
        int i4;
        pg2 pg2Var2;
        int i5;
        int i6;
        boolean z3;
        pg2 pg2Var3;
        boolean z4;
        pg2 pg2Var4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1398470928);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= j30VarQ.c(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    pg2Var2 = pg2Var;
                    if (j30VarQ.I(pg2Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                    if (i7 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    e40.CQf cQf = e40.a;
                    si.c(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, null, X.m(j30VarQ, 1780526035, new aj(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                    z4 = z3;
                    pg2Var4 = pg2Var3;
                } else {
                    j30VarQ.x();
                    pg2Var4 = pg2Var2;
                    z4 = z2;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new bj(i, i2, pg2Var4, h81Var, y81Var, z4);
            }
            i3 |= 384;
            pg2Var2 = pg2Var;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf2 = e40.a;
                si.c(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, null, X.m(j30VarQ, 1780526035, new aj(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                z4 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf3 = e40.a;
                si.c(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, null, X.m(j30VarQ, 1780526035, new aj(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                z4 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new bj(i, i2, pg2Var4, h81Var, y81Var, z4);
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                pg2Var2 = pg2Var;
                if (j30VarQ.I(pg2Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf4 = e40.a;
                si.c(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, null, X.m(j30VarQ, 1780526035, new aj(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                z4 = z3;
                pg2Var4 = pg2Var3;
            } else {
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf5 = e40.a;
                si.c(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, null, X.m(j30VarQ, 1780526035, new aj(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
                z4 = z3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new bj(i, i2, pg2Var4, h81Var, y81Var, z4);
        }
        i3 |= 384;
        pg2Var2 = pg2Var;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(y81Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170) {
            if (i7 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf6 = e40.a;
            si.c(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, null, X.m(j30VarQ, 1780526035, new aj(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
            z4 = z3;
            pg2Var4 = pg2Var3;
        } else {
            if (i7 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf7 = e40.a;
            si.c(h81Var, mw1.a(fTO$.h(pg2Var3, j30VarQ), h81Var), z3, null, X.m(j30VarQ, 1780526035, new aj(y81Var, i3)), j30VarQ, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 504);
            z4 = z3;
            pg2Var4 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new bj(i, i2, pg2Var4, h81Var, y81Var, z4);
    }
}
