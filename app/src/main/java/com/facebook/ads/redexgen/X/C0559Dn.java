package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0559Dn {
    public static String[] A0D = {"AytN1i9iULWpAtR2eIfx7QogEUuyUUX4", "EimBg0", "4eNGQSgLmn9gvaK14R8kSqnFmk3YDtSi", "2fyuIcJ7pz76VyZl9SMNa1chyaGQvScm", "P7Bhpggufyl3vqAGq89SAtaTbaXWozcC", "R5XBsX91lZ7HUyZ9KaLj5rOllXZCV26j", "kcg4Z6bP9bO4onTQZ6Z5ctV", "10vbbYYZLuUPLbeNO2JvVvesRy5vOtek"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0545Co A0C;

    public C0559Dn(InterfaceC0545Co interfaceC0545Co) {
        this.A0C = interfaceC0545Co;
    }

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
    private void A00(int i) {
        boolean z = this.A0A;
        this.A0C.AEH(this.A04, z ? 1 : 0, (int) (this.A01 - this.A03), i, null);
    }

    public final void A01() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A09 = false;
        this.A0B = false;
    }

    public final void A02(long j, int i) {
        if (this.A0B && this.A06) {
            this.A0A = this.A08;
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0D[7] = "hh10uoQ2wjGgTUsUevn281NORx98TkB1";
            this.A0B = false;
            return;
        }
        if (!this.A05 && !this.A06) {
            return;
        }
        if (this.A09) {
            A00(i + ((int) (j - this.A01)));
        }
        this.A03 = this.A01;
        this.A04 = this.A02;
        this.A09 = true;
        this.A0A = this.A08;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public final void A03(long j, int i, int i2, long j2) {
        boolean z;
        this.A06 = false;
        this.A05 = false;
        this.A02 = j2;
        this.A00 = 0;
        this.A01 = j;
        if (i2 >= 32) {
            if (!this.A0B && this.A09) {
                A00(i);
                this.A09 = false;
            }
            if (i2 <= 34) {
                boolean z2 = !this.A0B;
                String[] strArr = A0D;
                if (strArr[2].charAt(16) == strArr[3].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[2] = "wqfZZQZmQi2aSzTJgSnfuEG5zpWvg4YI";
                strArr2[3] = "uUijDIjLUkfNDtGFhTuIbp3J3vWPjHax";
                this.A05 = z2;
                this.A0B = true;
            }
        }
        String[] strArr3 = A0D;
        if (strArr3[2].charAt(16) != strArr3[3].charAt(16)) {
            A0D[7] = "VgXbI0fWsc6LBLXRTGKiMc1TRthchDi6";
            if (i2 >= 16) {
                z = i2 <= 21;
            }
            this.A08 = z;
            this.A07 = !this.A08 || i2 <= 9;
        }
        if (i2 >= 16) {
            if (i2 <= 21) {
            }
        }
        this.A08 = z;
        this.A07 = !this.A08 || i2 <= 9;
        this.A08 = z;
        this.A07 = !this.A08 || i2 <= 9;
    }

    public final void A04(byte[] bArr, int i, int i2) {
        if (this.A07) {
            int i3 = this.A00;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.A06 = (bArr[i4] & 128) != 0;
                this.A07 = false;
                return;
            }
            int i5 = i3 + (i2 - i);
            if (A0D[0].charAt(24) != 'E') {
                throw new RuntimeException();
            }
            A0D[0] = "OWSyVtAwrfkSOzobpeDsxETSEBQPa9qP";
            this.A00 = i5;
        }
    }
}
