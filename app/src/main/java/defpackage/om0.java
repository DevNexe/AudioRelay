package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class om0 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ long x;
        public final /* synthetic */ float y;
        public final /* synthetic */ float z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, long j, float f, float f2, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = j;
            this.y = f;
            this.z = f2;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            om0.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x008c, please report this as an issue */
    public static final void a(pg2 pg2Var, long j, float f, float f2, g30 g30Var, int i, int i2) {
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        int i5;
        int i6;
        pg2 pg2VarX;
        long jB;
        float density;
        pg2 pg2Var2;
        long j3;
        float f5;
        float f6;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1249392198);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i8 = j30VarQ.j(j2) ? 32 : 16;
                i3 |= i8;
            } else {
                j2 = j;
            }
            i3 |= i8;
        } else {
            j2 = j;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                f3 = f;
                i3 |= j30VarQ.g(f3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    f4 = f2;
                    if (j30VarQ.g(f4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                    j30VarQ.t0();
                    i6 = i & 1;
                    pg2VarX = pg2.QnHx.w;
                    if (i6 != 0 || j30VarQ.Y()) {
                        if (i7 != 0) {
                            pg2Var = pg2VarX;
                        }
                        if ((i2 & 2) != 0) {
                            jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                        } else {
                            jB = j2;
                        }
                        if (i9 != 0) {
                            f3 = 1;
                        }
                        if (i4 != 0) {
                            f4 = 0;
                        }
                    } else {
                        j30VarQ.x();
                        jB = j2;
                    }
                    j30VarQ.S();
                    if (!(f4 == 0.0f)) {
                        pg2VarX = ps0.X(pg2VarX, f4, 0.0f, 0.0f, 0.0f, 14);
                    }
                    j30VarQ.e(1228914189);
                    if (wm0.a(f3, 0.0f)) {
                        density = 1.0f / ((ij0) j30VarQ.E(r40.e)).getDensity();
                    } else {
                        density = f3;
                    }
                    j30VarQ.R(false);
                    fe.a(ps0.k(gm4.g(gm4.f(pg2Var.y(pg2VarX)), density), jB, el3.a), j30VarQ, 0);
                    pg2Var2 = pg2Var;
                    j3 = jB;
                } else {
                    j30VarQ.x();
                    pg2Var2 = pg2Var;
                    j3 = j2;
                }
                f5 = f3;
                f6 = f4;
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new QnHx(pg2Var2, j3, f5, f6, i, i2);
            }
            i3 |= 3072;
            f4 = f2;
            if ((i3 & 5851) == 1170) {
                j30VarQ.t0();
                i6 = i & 1;
                pg2VarX = pg2.QnHx.w;
                if (i6 != 0) {
                    if (i7 != 0) {
                        pg2Var = pg2VarX;
                    }
                    if ((i2 & 2) != 0) {
                        jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                    } else {
                        jB = j2;
                    }
                    if (i9 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                } else {
                    if (i7 != 0) {
                        pg2Var = pg2VarX;
                    }
                    if ((i2 & 2) != 0) {
                        jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                    } else {
                        jB = j2;
                    }
                    if (i9 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                }
                j30VarQ.S();
                if (!(f4 == 0.0f)) {
                    pg2VarX = ps0.X(pg2VarX, f4, 0.0f, 0.0f, 0.0f, 14);
                }
                j30VarQ.e(1228914189);
                if (wm0.a(f3, 0.0f)) {
                    density = 1.0f / ((ij0) j30VarQ.E(r40.e)).getDensity();
                } else {
                    density = f3;
                }
                j30VarQ.R(false);
                fe.a(ps0.k(gm4.g(gm4.f(pg2Var.y(pg2VarX)), density), jB, el3.a), j30VarQ, 0);
                pg2Var2 = pg2Var;
                j3 = jB;
            } else {
                j30VarQ.t0();
                i6 = i & 1;
                pg2VarX = pg2.QnHx.w;
                if (i6 != 0) {
                    if (i7 != 0) {
                        pg2Var = pg2VarX;
                    }
                    if ((i2 & 2) != 0) {
                        jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                    } else {
                        jB = j2;
                    }
                    if (i9 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                } else {
                    if (i7 != 0) {
                        pg2Var = pg2VarX;
                    }
                    if ((i2 & 2) != 0) {
                        jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                    } else {
                        jB = j2;
                    }
                    if (i9 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                }
                j30VarQ.S();
                if (!(f4 == 0.0f)) {
                    pg2VarX = ps0.X(pg2VarX, f4, 0.0f, 0.0f, 0.0f, 14);
                }
                j30VarQ.e(1228914189);
                if (wm0.a(f3, 0.0f)) {
                    density = 1.0f / ((ij0) j30VarQ.E(r40.e)).getDensity();
                } else {
                    density = f3;
                }
                j30VarQ.R(false);
                fe.a(ps0.k(gm4.g(gm4.f(pg2Var.y(pg2VarX)), density), jB, el3.a), j30VarQ, 0);
                pg2Var2 = pg2Var;
                j3 = jB;
            }
            f5 = f3;
            f6 = f4;
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(pg2Var2, j3, f5, f6, i, i2);
        }
        i3 |= 384;
        f3 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                f4 = f2;
                if (j30VarQ.g(f4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                j30VarQ.t0();
                i6 = i & 1;
                pg2VarX = pg2.QnHx.w;
                if (i6 != 0) {
                    if (i7 != 0) {
                        pg2Var = pg2VarX;
                    }
                    if ((i2 & 2) != 0) {
                        jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                    } else {
                        jB = j2;
                    }
                    if (i9 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                } else {
                    if (i7 != 0) {
                        pg2Var = pg2VarX;
                    }
                    if ((i2 & 2) != 0) {
                        jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                    } else {
                        jB = j2;
                    }
                    if (i9 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                }
                j30VarQ.S();
                if (!(f4 == 0.0f)) {
                    pg2VarX = ps0.X(pg2VarX, f4, 0.0f, 0.0f, 0.0f, 14);
                }
                j30VarQ.e(1228914189);
                if (wm0.a(f3, 0.0f)) {
                    density = 1.0f / ((ij0) j30VarQ.E(r40.e)).getDensity();
                } else {
                    density = f3;
                }
                j30VarQ.R(false);
                fe.a(ps0.k(gm4.g(gm4.f(pg2Var.y(pg2VarX)), density), jB, el3.a), j30VarQ, 0);
                pg2Var2 = pg2Var;
                j3 = jB;
            } else {
                j30VarQ.t0();
                i6 = i & 1;
                pg2VarX = pg2.QnHx.w;
                if (i6 != 0) {
                    if (i7 != 0) {
                        pg2Var = pg2VarX;
                    }
                    if ((i2 & 2) != 0) {
                        jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                    } else {
                        jB = j2;
                    }
                    if (i9 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                } else {
                    if (i7 != 0) {
                        pg2Var = pg2VarX;
                    }
                    if ((i2 & 2) != 0) {
                        jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                    } else {
                        jB = j2;
                    }
                    if (i9 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                }
                j30VarQ.S();
                if (!(f4 == 0.0f)) {
                    pg2VarX = ps0.X(pg2VarX, f4, 0.0f, 0.0f, 0.0f, 14);
                }
                j30VarQ.e(1228914189);
                if (wm0.a(f3, 0.0f)) {
                    density = 1.0f / ((ij0) j30VarQ.E(r40.e)).getDensity();
                } else {
                    density = f3;
                }
                j30VarQ.R(false);
                fe.a(ps0.k(gm4.g(gm4.f(pg2Var.y(pg2VarX)), density), jB, el3.a), j30VarQ, 0);
                pg2Var2 = pg2Var;
                j3 = jB;
            }
            f5 = f3;
            f6 = f4;
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new QnHx(pg2Var2, j3, f5, f6, i, i2);
        }
        i3 |= 3072;
        f4 = f2;
        if ((i3 & 5851) == 1170) {
            j30VarQ.t0();
            i6 = i & 1;
            pg2VarX = pg2.QnHx.w;
            if (i6 != 0) {
                if (i7 != 0) {
                    pg2Var = pg2VarX;
                }
                if ((i2 & 2) != 0) {
                    jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                } else {
                    jB = j2;
                }
                if (i9 != 0) {
                    f3 = 1;
                }
                if (i4 != 0) {
                    f4 = 0;
                }
            } else {
                if (i7 != 0) {
                    pg2Var = pg2VarX;
                }
                if ((i2 & 2) != 0) {
                    jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                } else {
                    jB = j2;
                }
                if (i9 != 0) {
                    f3 = 1;
                }
                if (i4 != 0) {
                    f4 = 0;
                }
            }
            j30VarQ.S();
            if (!(f4 == 0.0f)) {
                pg2VarX = ps0.X(pg2VarX, f4, 0.0f, 0.0f, 0.0f, 14);
            }
            j30VarQ.e(1228914189);
            if (wm0.a(f3, 0.0f)) {
                density = 1.0f / ((ij0) j30VarQ.E(r40.e)).getDensity();
            } else {
                density = f3;
            }
            j30VarQ.R(false);
            fe.a(ps0.k(gm4.g(gm4.f(pg2Var.y(pg2VarX)), density), jB, el3.a), j30VarQ, 0);
            pg2Var2 = pg2Var;
            j3 = jB;
        } else {
            j30VarQ.t0();
            i6 = i & 1;
            pg2VarX = pg2.QnHx.w;
            if (i6 != 0) {
                if (i7 != 0) {
                    pg2Var = pg2VarX;
                }
                if ((i2 & 2) != 0) {
                    jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                } else {
                    jB = j2;
                }
                if (i9 != 0) {
                    f3 = 1;
                }
                if (i4 != 0) {
                    f4 = 0;
                }
            } else {
                if (i7 != 0) {
                    pg2Var = pg2VarX;
                }
                if ((i2 & 2) != 0) {
                    jB = yu.b(((rv) j30VarQ.E(sv.a)).f(), 0.12f);
                } else {
                    jB = j2;
                }
                if (i9 != 0) {
                    f3 = 1;
                }
                if (i4 != 0) {
                    f4 = 0;
                }
            }
            j30VarQ.S();
            if (!(f4 == 0.0f)) {
                pg2VarX = ps0.X(pg2VarX, f4, 0.0f, 0.0f, 0.0f, 14);
            }
            j30VarQ.e(1228914189);
            if (wm0.a(f3, 0.0f)) {
                density = 1.0f / ((ij0) j30VarQ.E(r40.e)).getDensity();
            } else {
                density = f3;
            }
            j30VarQ.R(false);
            fe.a(ps0.k(gm4.g(gm4.f(pg2Var.y(pg2VarX)), density), jB, el3.a), j30VarQ, 0);
            pg2Var2 = pg2Var;
            j3 = jB;
        }
        f5 = f3;
        f6 = f4;
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(pg2Var2, j3, f5, f6, i, i2);
    }
}
