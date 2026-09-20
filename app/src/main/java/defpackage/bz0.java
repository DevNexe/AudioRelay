package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bz0 implements vy0 {
    public final float a;
    public final gr4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public bz0() {
        float f = 0.0f;
        this(f, f, 7);
    }

    public bz0(float f, float f2, float f3) {
        this.a = f3;
        gr4 gr4Var = new gr4();
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        gr4Var.g = f;
        gr4Var.c = false;
        double d = gr4Var.b;
        if (((float) (d * d)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        gr4Var.b = Math.sqrt(f2);
        gr4Var.c = false;
        this.b = gr4Var;
    }

    @Override // defpackage.Ah
    public final bh5 a(pb5 pb5Var) {
        return new gh5(this);
    }

    @Override // defpackage.vy0
    public final float b(long j, float f, float f2, float f3) {
        gr4 gr4Var = this.b;
        gr4Var.a = f2;
        return Float.intBitsToFloat((int) (gr4Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x026f A[PHI: r13
  0x026f: PHI (r13v12 double) = (r13v11 double), (r13v11 double), (r13v11 double), (r13v11 double), (r13v16 double) binds: [B:93:0x0235, B:95:0x023b, B:102:0x025c, B:104:0x0260, B:105:0x0262] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ec A[LOOP:1: B:70:0x01e9->B:72:0x01ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x020d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0212  */
    /* JADX WARN: Code duplicated, block: B:82:0x0214  */
    /* JADX WARN: Code duplicated, block: B:87:0x0222  */
    /* JADX WARN: Code duplicated, block: B:91:0x0227  */
    @Override // defpackage.vy0
    public final long c(float f, float f2, float f3) {
        double dAbs;
        double d;
        double dLog;
        double dLog2;
        double dLog3;
        int i;
        double d2;
        boolean z;
        boolean z2;
        double d3;
        double d4;
        double d5;
        cr4 cr4Var;
        dr4 dr4Var;
        int i2;
        double dAbs2;
        double dLog4;
        long j;
        double d6;
        double dLog5;
        boolean z3;
        boolean z4;
        double dLog6;
        double d7;
        double d8;
        er4 er4Var;
        fr4 fr4Var;
        double d9;
        int i3;
        double d10;
        double dAbs3;
        double d11;
        gr4 gr4Var = this.b;
        double d12 = gr4Var.b;
        float f4 = gr4Var.g;
        float f5 = this.a;
        double d13 = (float) (d12 * d12);
        double d14 = f4;
        double d15 = f3 / f5;
        double d16 = (f - f2) / f5;
        double d17 = 1.0f;
        double dSqrt = d14 * 2.0d * Math.sqrt(d13);
        double d18 = -dSqrt;
        double d19 = (dSqrt * dSqrt) - (d13 * 4.0d);
        ny nyVarL = X.l(d19);
        nyVarL.a = (nyVarL.a + d18) / 2.0d;
        nyVarL.b /= 2.0d;
        ny nyVarL2 = X.l(d19);
        double d20 = -1;
        double d21 = nyVarL2.a * d20;
        double d22 = nyVarL2.b * d20;
        nyVarL2.a = (d21 + d18) / 2.0d;
        nyVarL2.b = d22 / 2.0d;
        if (!(d16 == 0.0d)) {
            if (d16 < 0.0d) {
                d15 = -d15;
            }
            dAbs = Math.abs(d16);
            if (d14 > 1.0d) {
                double d23 = nyVarL.a;
                double d24 = nyVarL2.a;
                double d25 = (d23 * dAbs) - d15;
                double d26 = d23 - d24;
                double d27 = d25 / d26;
                d6 = dAbs - d27;
                dLog4 = Math.log(Math.abs(d17 / d6)) / d23;
                dLog5 = Math.log(Math.abs(d17 / d27)) / d24;
                if (Double.isInfinite(dLog4) || Double.isNaN(dLog4)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    dLog4 = dLog5;
                } else {
                    if (Double.isInfinite(dLog5) || Double.isNaN(dLog5)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!(true ^ z4)) {
                        dLog4 = Math.max(dLog4, dLog5);
                    }
                }
                double d28 = d6 * d23;
                dLog6 = Math.log(d28 / ((-d27) * d24)) / (d24 - d23);
                if (Double.isNaN(dLog6) || dLog6 <= 0.0d) {
                    d7 = d6;
                    d8 = -d17;
                } else {
                    if (dLog6 > 0.0d) {
                        d7 = d6;
                        if ((-((Math.exp(dLog6 * d24) * d27) + (Math.exp(d23 * dLog6) * d7))) < d17) {
                            d11 = -d17;
                            dLog4 = (d27 <= 0.0d || d7 >= 0.0d) ? dLog4 : 0.0d;
                        }
                        d8 = d11;
                    } else {
                        d7 = d6;
                    }
                    d11 = d17;
                    dLog4 = Math.log((-((d27 * d24) * d24)) / (d28 * d23)) / d26;
                    d8 = d11;
                }
                double d29 = d7;
                er4Var = new er4(d29, d23, d27, d24, d8);
                fr4Var = new fr4(d29, d23, d27, d24);
                if (Math.abs(((Number) er4Var.invoke(Double.valueOf(dLog4))).doubleValue()) >= 1.0E-4d) {
                    d9 = dLog4;
                    i3 = 0;
                    dAbs3 = Double.MAX_VALUE;
                    while (dAbs3 > d10 && i3 < 100) {
                        i3++;
                        double dDoubleValue = d9 - (((Number) er4Var.invoke(Double.valueOf(d9))).doubleValue() / ((Number) fr4Var.invoke(Double.valueOf(d9))).doubleValue());
                        dAbs3 = Math.abs(d9 - dDoubleValue);
                        d9 = dDoubleValue;
                    }
                    dLog4 = d9;
                }
            } else if (d14 < 1.0d) {
                double d30 = nyVarL.a;
                double d31 = (d15 - (d30 * dAbs)) / nyVarL.b;
                dLog4 = Math.log(d17 / Math.sqrt((d31 * d31) + (dAbs * dAbs))) / d30;
            } else {
                d = nyVarL.a;
                double d32 = d * dAbs;
                double d33 = d15 - d32;
                dLog = Math.log(Math.abs(d17 / dAbs)) / d;
                dLog2 = Math.log(Math.abs(d17 / d33));
                dLog3 = dLog2;
                while (i < 6) {
                    dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d));
                }
                d2 = dLog3 / d;
                if (Double.isInfinite(dLog) || Double.isNaN(dLog)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    dLog = d2;
                } else {
                    if (Double.isInfinite(d2) || Double.isNaN(d2)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!(!z2)) {
                        dLog = Math.max(dLog, d2);
                    }
                }
                d3 = (-(d32 + d33)) / (d * d33);
                if (Double.isNaN(d3) || d3 <= 0.0d) {
                    d4 = -d17;
                    d5 = dLog;
                } else {
                    if (d3 > 0.0d) {
                        double d34 = d * d3;
                        if ((-((Math.exp(d34) * d3 * d33) + (Math.exp(d34) * dAbs))) < d17) {
                            if (d33 < 0.0d && dAbs > 0.0d) {
                                dLog = 0.0d;
                            }
                            d4 = -d17;
                            d5 = dLog;
                        }
                    }
                    d5 = (-(2.0d / d)) - (dAbs / d33);
                    d4 = d17;
                }
                cr4Var = new cr4(dAbs, d33, d, d4);
                dr4Var = new dr4(d33, d, dAbs);
                i2 = 0;
                dAbs2 = Double.MAX_VALUE;
                while (dAbs2 > 0.001d && i2 < 100) {
                    i2++;
                    double dDoubleValue2 = d5 - (((Number) cr4Var.invoke(Double.valueOf(d5))).doubleValue() / ((Number) dr4Var.invoke(Double.valueOf(d5))).doubleValue());
                    dAbs2 = Math.abs(d5 - dDoubleValue2);
                    d5 = dDoubleValue2;
                }
                dLog4 = d5;
            }
            j = (long) (dLog4 * 1000.0d);
        } else if (d15 == 0.0d) {
            j = 0;
        } else {
            if (d16 < 0.0d) {
                d15 = -d15;
            }
            dAbs = Math.abs(d16);
            if (d14 > 1.0d) {
                double d210 = nyVarL.a;
                double d211 = nyVarL2.a;
                double d212 = (d210 * dAbs) - d15;
                double d213 = d210 - d211;
                double d214 = d212 / d213;
                d6 = dAbs - d214;
                dLog4 = Math.log(Math.abs(d17 / d6)) / d210;
                dLog5 = Math.log(Math.abs(d17 / d214)) / d211;
                if (Double.isInfinite(dLog4)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    dLog4 = dLog5;
                } else {
                    if (Double.isInfinite(dLog5)) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (!(true ^ z4)) {
                        dLog4 = Math.max(dLog4, dLog5);
                    }
                }
                double d215 = d6 * d210;
                dLog6 = Math.log(d215 / ((-d214) * d211)) / (d211 - d210);
                if (Double.isNaN(dLog6)) {
                    d7 = d6;
                    d8 = -d17;
                } else {
                    d7 = d6;
                    d8 = -d17;
                }
                double d216 = d7;
                er4Var = new er4(d216, d210, d214, d211, d8);
                fr4Var = new fr4(d216, d210, d214, d211);
                if (Math.abs(((Number) er4Var.invoke(Double.valueOf(dLog4))).doubleValue()) >= 1.0E-4d) {
                    d9 = dLog4;
                    i3 = 0;
                    dAbs3 = Double.MAX_VALUE;
                    for (d10 = 0.001d; dAbs3 > d10; d10 = 0.001d) {
                        i3++;
                        double dDoubleValue3 = d9 - (((Number) er4Var.invoke(Double.valueOf(d9))).doubleValue() / ((Number) fr4Var.invoke(Double.valueOf(d9))).doubleValue());
                        dAbs3 = Math.abs(d9 - dDoubleValue3);
                        d9 = dDoubleValue3;
                    }
                    dLog4 = d9;
                }
            } else if (d14 < 1.0d) {
                double d35 = nyVarL.a;
                double d36 = (d15 - (d35 * dAbs)) / nyVarL.b;
                dLog4 = Math.log(d17 / Math.sqrt((d36 * d36) + (dAbs * dAbs))) / d35;
            } else {
                d = nyVarL.a;
                double d37 = d * dAbs;
                double d38 = d15 - d37;
                dLog = Math.log(Math.abs(d17 / dAbs)) / d;
                dLog2 = Math.log(Math.abs(d17 / d38));
                dLog3 = dLog2;
                for (i = 0; i < 6; i++) {
                    dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d));
                }
                d2 = dLog3 / d;
                if (Double.isInfinite(dLog)) {
                    z = false;
                } else {
                    z = false;
                }
                if (!z) {
                    dLog = d2;
                } else {
                    if (Double.isInfinite(d2)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!(!z2)) {
                        dLog = Math.max(dLog, d2);
                    }
                }
                d3 = (-(d37 + d38)) / (d * d38);
                if (Double.isNaN(d3)) {
                    d4 = -d17;
                    d5 = dLog;
                } else {
                    d4 = -d17;
                    d5 = dLog;
                }
                cr4Var = new cr4(dAbs, d38, d, d4);
                dr4Var = new dr4(d38, d, dAbs);
                i2 = 0;
                dAbs2 = Double.MAX_VALUE;
                while (dAbs2 > 0.001d) {
                    i2++;
                    double dDoubleValue4 = d5 - (((Number) cr4Var.invoke(Double.valueOf(d5))).doubleValue() / ((Number) dr4Var.invoke(Double.valueOf(d5))).doubleValue());
                    dAbs2 = Math.abs(d5 - dDoubleValue4);
                    d5 = dDoubleValue4;
                }
                dLog4 = d5;
            }
            j = (long) (dLog4 * 1000.0d);
        }
        return j * 1000000;
    }

    @Override // defpackage.vy0
    public final float d(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.vy0
    public final float e(long j, float f, float f2, float f3) {
        gr4 gr4Var = this.b;
        gr4Var.a = f2;
        return Float.intBitsToFloat((int) (gr4Var.a(f, f3, j / 1000000) >> 32));
    }

    public /* synthetic */ bz0(float f, float f2, int i) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : 0.0f);
    }
}
