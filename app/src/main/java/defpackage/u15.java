package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u15 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ String w;
        public final /* synthetic */ float x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(String str, float f, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = str;
            this.x = f;
            this.y = pg2Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            u15.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, float f, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        float f2;
        int i4;
        pg2 pg2Var2;
        int i5;
        float f3;
        pg2.QnHx qnHx;
        pg2 pg2Var3;
        float f4;
        pg2 pg2Var4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(210747651);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                f2 = f;
                i3 |= j30VarQ.g(f2) ? 32 : 16;
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
                if ((i3 & 731) == 146 || !j30VarQ.t()) {
                    if (i6 != 0) {
                        f3 = 16;
                    } else {
                        f3 = f2;
                    }
                    qnHx = pg2.QnHx.w;
                    if (i4 != 0) {
                        pg2Var3 = qnHx;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    e40.CQf cQf = e40.a;
                    j55.b(str, ps0.X(qnHx, 0.0f, 0.0f, 0.0f, f3, 7).y(pg2Var3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).f, j30VarQ, i3 & 14, 0, 32764);
                    f4 = f3;
                    pg2Var4 = pg2Var3;
                } else {
                    j30VarQ.x();
                    f4 = f2;
                    pg2Var4 = pg2Var2;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new QnHx(str, f4, pg2Var4, i, i2);
            }
            i3 |= 384;
            pg2Var2 = pg2Var;
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    f3 = 16;
                } else {
                    f3 = f2;
                }
                qnHx = pg2.QnHx.w;
                if (i4 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf2 = e40.a;
                j55.b(str, ps0.X(qnHx, 0.0f, 0.0f, 0.0f, f3, 7).y(pg2Var3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).f, j30VarQ, i3 & 14, 0, 32764);
                f4 = f3;
                pg2Var4 = pg2Var3;
            } else {
                if (i6 != 0) {
                    f3 = 16;
                } else {
                    f3 = f2;
                }
                qnHx = pg2.QnHx.w;
                if (i4 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf3 = e40.a;
                j55.b(str, ps0.X(qnHx, 0.0f, 0.0f, 0.0f, f3, 7).y(pg2Var3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).f, j30VarQ, i3 & 14, 0, 32764);
                f4 = f3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(str, f4, pg2Var4, i, i2);
        }
        i3 |= 48;
        f2 = f;
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
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    f3 = 16;
                } else {
                    f3 = f2;
                }
                qnHx = pg2.QnHx.w;
                if (i4 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf4 = e40.a;
                j55.b(str, ps0.X(qnHx, 0.0f, 0.0f, 0.0f, f3, 7).y(pg2Var3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).f, j30VarQ, i3 & 14, 0, 32764);
                f4 = f3;
                pg2Var4 = pg2Var3;
            } else {
                if (i6 != 0) {
                    f3 = 16;
                } else {
                    f3 = f2;
                }
                qnHx = pg2.QnHx.w;
                if (i4 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf5 = e40.a;
                j55.b(str, ps0.X(qnHx, 0.0f, 0.0f, 0.0f, f3, 7).y(pg2Var3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).f, j30VarQ, i3 & 14, 0, 32764);
                f4 = f3;
                pg2Var4 = pg2Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(str, f4, pg2Var4, i, i2);
        }
        i3 |= 384;
        pg2Var2 = pg2Var;
        if ((i3 & 731) == 146) {
            if (i6 != 0) {
                f3 = 16;
            } else {
                f3 = f2;
            }
            qnHx = pg2.QnHx.w;
            if (i4 != 0) {
                pg2Var3 = qnHx;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf6 = e40.a;
            j55.b(str, ps0.X(qnHx, 0.0f, 0.0f, 0.0f, f3, 7).y(pg2Var3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).f, j30VarQ, i3 & 14, 0, 32764);
            f4 = f3;
            pg2Var4 = pg2Var3;
        } else {
            if (i6 != 0) {
                f3 = 16;
            } else {
                f3 = f2;
            }
            qnHx = pg2.QnHx.w;
            if (i4 != 0) {
                pg2Var3 = qnHx;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf7 = e40.a;
            j55.b(str, ps0.X(qnHx, 0.0f, 0.0f, 0.0f, f3, 7).y(pg2Var3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).f, j30VarQ, i3 & 14, 0, 32764);
            f4 = f3;
            pg2Var4 = pg2Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(str, f4, pg2Var4, i, i2);
    }
}
