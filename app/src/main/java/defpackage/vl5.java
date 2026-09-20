package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class vl5 implements Closeable {
    public final boolean A;
    public final long B;
    public final gg C = new gg();
    public final gg D;
    public boolean E;
    public bd2 F;
    public final byte[] G;
    public final gg.QnHx H;
    public final boolean w;
    public final xh x;
    public final Random y;
    public final boolean z;

    public vl5(boolean z, xh xhVar, Random random, boolean z2, boolean z3, long j) {
        this.w = z;
        this.x = xhVar;
        this.y = random;
        this.z = z2;
        this.A = z3;
        this.B = j;
        this.D = xhVar.a();
        this.G = z ? new byte[4] : null;
        this.H = z ? new gg.QnHx() : null;
    }

    public final void b(int i, mk mkVar) {
        if (this.E) {
            throw new IOException("closed");
        }
        int iC = mkVar.c();
        if (!(((long) iC) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        gg ggVar = this.D;
        ggVar.L(i | 128);
        if (this.w) {
            ggVar.L(iC | 128);
            Random random = this.y;
            byte[] bArr = this.G;
            random.nextBytes(bArr);
            ggVar.write(bArr, 0, bArr.length);
            if (iC > 0) {
                long j = ggVar.x;
                mkVar.q(ggVar, mkVar.c());
                gg.QnHx qnHx = this.H;
                ggVar.j(qnHx);
                qnHx.c(j);
                XTd3.x(qnHx, bArr);
                qnHx.close();
            }
        } else {
            ggVar.L(iC);
            mkVar.q(ggVar, mkVar.c());
        }
        this.x.flush();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    public final void c(int i, mk mkVar) throws IOException {
        gg ggVar;
        byte[] bArr;
        if (this.E) {
            throw new IOException("closed");
        }
        gg ggVar2 = this.C;
        ggVar2.getClass();
        mkVar.q(ggVar2, mkVar.c());
        int i2 = i | 128;
        if (this.z && mkVar.c() >= this.B) {
            bd2 bd2Var = this.F;
            if (bd2Var == null) {
                bd2Var = new bd2(this.A);
                this.F = bd2Var;
            }
            gg ggVar3 = bd2Var.x;
            boolean z = true;
            if (!(ggVar3.x == 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (bd2Var.w) {
                bd2Var.y.reset();
            }
            long j = ggVar2.x;
            si0 si0Var = bd2Var.z;
            si0Var.V(ggVar2, j);
            si0Var.flush();
            mk mkVar2 = cd2.a;
            long j2 = ggVar3.x;
            byte[] bArr2 = mkVar2.w;
            long length = j2 - ((long) bArr2.length);
            int length2 = bArr2.length;
            if (length < 0 || length2 < 0 || j2 - length < length2 || bArr2.length - 0 < length2) {
                z = false;
                break;
            }
            if (length2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (ggVar3.h(((long) i3) + length) != mkVar2.w[i3 + 0]) {
                        z = false;
                        break;
                    } else if (i4 >= length2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            if (z) {
                long j3 = ggVar3.x - ((long) 4);
                gg.QnHx qnHxJ = ggVar3.j(cp5.a);
                try {
                    qnHxJ.b(j3);
                    Th.d(qnHxJ, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Th.d(qnHxJ, th);
                        throw th2;
                    }
                }
            } else {
                ggVar3.L(0);
            }
            ggVar2.V(ggVar3, ggVar3.x);
            i2 |= 64;
        }
        long j4 = ggVar2.x;
        gg ggVar4 = this.D;
        ggVar4.L(i2);
        boolean z2 = this.w;
        int i5 = z2 ? 128 : 0;
        if (j4 > 125) {
            if (j4 <= 65535) {
                ggVar4.L(i5 | 126);
                ggVar4.R((int) j4);
            } else {
                ggVar4.L(i5 | 127);
                g74 g74VarF = ggVar4.F(8);
                int i6 = g74VarF.c;
                int i7 = i6 + 1;
                byte[] bArr3 = g74VarF.a;
                bArr3[i6] = (byte) ((j4 >>> 56) & 255);
                int i8 = i7 + 1;
                ggVar = ggVar4;
                bArr3[i7] = (byte) ((j4 >>> 48) & 255);
                int i9 = i8 + 1;
                bArr3[i8] = (byte) ((j4 >>> 40) & 255);
                int i10 = i9 + 1;
                bArr3[i9] = (byte) ((j4 >>> 32) & 255);
                int i11 = i10 + 1;
                bArr3[i10] = (byte) ((j4 >>> 24) & 255);
                int i12 = i11 + 1;
                bArr3[i11] = (byte) ((j4 >>> 16) & 255);
                int i13 = i12 + 1;
                bArr3[i12] = (byte) ((j4 >>> 8) & 255);
                bArr3[i13] = (byte) (j4 & 255);
                g74VarF.c = i13 + 1;
                ggVar.x += 8;
            }
            if (z2) {
                Random random = this.y;
                bArr = this.G;
                random.nextBytes(bArr);
                ggVar.write(bArr, 0, bArr.length);
                if (j4 > 0) {
                    gg.QnHx qnHx = this.H;
                    ggVar2.j(qnHx);
                    qnHx.c(0L);
                    XTd3.x(qnHx, bArr);
                    qnHx.close();
                }
            }
            ggVar.V(ggVar2, j4);
            this.x.x();
        }
        ggVar4.L(i5 | ((int) j4));
        ggVar = ggVar4;
        if (z2) {
            Random random2 = this.y;
            bArr = this.G;
            random2.nextBytes(bArr);
            ggVar.write(bArr, 0, bArr.length);
            if (j4 > 0) {
                gg.QnHx qnHx2 = this.H;
                ggVar2.j(qnHx2);
                qnHx2.c(0L);
                XTd3.x(qnHx2, bArr);
                qnHx2.close();
            }
        }
        ggVar.V(ggVar2, j4);
        this.x.x();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        bd2 bd2Var = this.F;
        if (bd2Var == null) {
            return;
        }
        bd2Var.close();
    }
}
