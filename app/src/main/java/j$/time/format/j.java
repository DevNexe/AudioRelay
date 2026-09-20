package j$.time.format;

import j$.time.DateTimeException;

/* JADX INFO: loaded from: classes2.dex */
final class j implements g {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final j$.time.temporal.q a;
    final int b;
    final int c;
    private final z d;
    final int e;

    j(j$.time.temporal.q qVar, int i, int i2, z zVar) {
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = zVar;
        this.e = 0;
    }

    protected j(j$.time.temporal.q qVar, int i, int i2, z zVar, int i3) {
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = zVar;
        this.e = i3;
    }

    final j b() {
        return this.e == -1 ? this : new j(this.a, this.b, this.c, this.d, -1);
    }

    final j c(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.a;
        Long lE = uVar.e(qVar);
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        w wVarB = uVar.b();
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new DateTimeException("Field " + qVar + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        wVarB.getClass();
        int i2 = this.b;
        z zVar = this.d;
        if (jLongValue >= 0) {
            int i3 = d.a[zVar.ordinal()];
            if (i3 == 1 ? !(i2 >= 19 || jLongValue < f[i2]) : i3 == 2) {
                sb.append('+');
            }
        } else {
            int i4 = d.a[zVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + qVar + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0184  */
    /* JADX WARN: Code duplicated, block: B:139:0x018c  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x017a, code lost:
    
        if (r3 <= r6) goto L114;
     */
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(j$.time.format.s r23, java.lang.CharSequence r24, int r25) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.k(j$.time.format.s, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        z zVar = this.d;
        j$.time.temporal.q qVar = this.a;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && zVar == z.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i2 == i && zVar == z.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i2 + ")";
        }
        return "Value(" + qVar + "," + i2 + "," + i + "," + zVar + ")";
    }
}
