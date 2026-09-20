package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bHr {
    public static final QnHx a = QnHx.w;

    public static final class QnHx extends cx1 implements j81<r53, c55> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final c55 invoke(r53 r53Var) {
            return new c55(r53Var);
        }
    }

    public static final void a(float[] fArr, float[] fArr2) {
        float fB = b(fArr2, 0, fArr, 0);
        float fB2 = b(fArr2, 0, fArr, 1);
        float fB3 = b(fArr2, 0, fArr, 2);
        float fB4 = b(fArr2, 0, fArr, 3);
        float fB5 = b(fArr2, 1, fArr, 0);
        float fB6 = b(fArr2, 1, fArr, 1);
        float fB7 = b(fArr2, 1, fArr, 2);
        float fB8 = b(fArr2, 1, fArr, 3);
        float fB9 = b(fArr2, 2, fArr, 0);
        float fB10 = b(fArr2, 2, fArr, 1);
        float fB11 = b(fArr2, 2, fArr, 2);
        float fB12 = b(fArr2, 2, fArr, 3);
        float fB13 = b(fArr2, 3, fArr, 0);
        float fB14 = b(fArr2, 3, fArr, 1);
        float fB15 = b(fArr2, 3, fArr, 2);
        float fB16 = b(fArr2, 3, fArr, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    public static final float b(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 0] * fArr2[0 + i2]);
    }
}
