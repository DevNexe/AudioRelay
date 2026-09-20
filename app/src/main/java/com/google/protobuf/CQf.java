package com.google.protobuf;

import com.google.protobuf.CQf;
import com.google.protobuf.CQf.QnHx;
import defpackage.lk;
import defpackage.n54;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CQf<MessageType extends CQf<MessageType, BuilderType>, BuilderType extends QnHx<MessageType, BuilderType>> implements DzVS {
    public int w = 0;

    public final void A(OutputStream outputStream) {
        int iJ = j();
        int iR1 = CodedOutputStream.r1(iJ) + iJ;
        if (iR1 > 4096) {
            iR1 = 4096;
        }
        CodedOutputStream.F1 f1 = new CodedOutputStream.F1(outputStream, iR1);
        f1.P1(iJ);
        h(f1);
        if (f1.B > 0) {
            f1.X1();
        }
    }

    @Override // com.google.protobuf.DzVS
    public final lk.YKK i() {
        try {
            int iJ = j();
            lk.YKK ykk = lk.x;
            byte[] bArr = new byte[iJ];
            Logger logger = CodedOutputStream.x;
            CodedOutputStream.CQf cQf = new CodedOutputStream.CQf(bArr, iJ);
            h(cQf);
            if (cQf.S1() == 0) {
                return new lk.YKK(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(t("ByteString"), e);
        }
    }

    public int q() {
        throw new UnsupportedOperationException();
    }

    public int r(n54 n54Var) {
        int iQ = q();
        if (iQ != -1) {
            return iQ;
        }
        int iE = n54Var.e(this);
        w(iE);
        return iE;
    }

    public final String t(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException u() {
        return new UninitializedMessageException();
    }

    public void w(int i) {
        throw new UnsupportedOperationException();
    }

    public final byte[] x() {
        try {
            int iJ = j();
            byte[] bArr = new byte[iJ];
            Logger logger = CodedOutputStream.x;
            CodedOutputStream.CQf cQf = new CodedOutputStream.CQf(bArr, iJ);
            h(cQf);
            if (cQf.S1() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(t("byte array"), e);
        }
    }

    public static abstract class QnHx<MessageType extends CQf<MessageType, BuilderType>, BuilderType extends QnHx<MessageType, BuilderType>> implements DzVS.QnHx {
        public final String q() {
            return "Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).";
        }

        /* JADX INFO: renamed from: com.google.protobuf.CQf$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0089QnHx extends FilterInputStream {
            public int w;

            public C0089QnHx(InputStream inputStream, int i) {
                super(inputStream);
                this.w = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.w);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.w <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.w--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) {
                int iSkip = (int) super.skip(Math.min(j, this.w));
                if (iSkip >= 0) {
                    this.w -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.w;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.w -= i4;
                }
                return i4;
            }
        }
    }
}
