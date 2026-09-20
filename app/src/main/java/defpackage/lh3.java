package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class lh3 implements Closeable {
    public static final Logger C = Logger.getLogger(lh3.class.getName());
    public QnHx A;
    public final byte[] B;
    public final RandomAccessFile w;
    public int x;
    public int y;
    public QnHx z;

    public static class QnHx {
        public static final QnHx c = new QnHx(0, 0);
        public final int a;
        public final int b;

        public QnHx(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(QnHx.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return ex0.c(sb, this.b, "]");
        }
    }

    public lh3(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.B = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                int i2 = 0;
                for (int i3 = 4; i < i3; i3 = 4) {
                    int i4 = iArr[i];
                    bArr2[i2] = (byte) (i4 >> 24);
                    bArr2[i2 + 1] = (byte) (i4 >> 16);
                    bArr2[i2 + 2] = (byte) (i4 >> 8);
                    bArr2[i2 + 3] = (byte) i4;
                    i2 += 4;
                    i++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.w = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iF = f(0, bArr);
        this.x = iF;
        if (iF > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.x + ", Actual length: " + randomAccessFile2.length());
        }
        this.y = f(4, bArr);
        int iF2 = f(8, bArr);
        int iF3 = f(12, bArr);
        this.z = e(iF2);
        this.A = e(iF3);
    }

    public static int f(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final void b(byte[] bArr) {
        boolean z;
        int iM;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    c(length);
                    synchronized (this) {
                        z = this.y == 0;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        if (z) {
            iM = 16;
        } else {
            QnHx qnHx = this.A;
            iM = m(qnHx.a + 4 + qnHx.b);
        }
        QnHx qnHx2 = new QnHx(iM, length);
        byte[] bArr2 = this.B;
        bArr2[0] = (byte) (length >> 24);
        bArr2[1] = (byte) (length >> 16);
        bArr2[2] = (byte) (length >> 8);
        bArr2[3] = (byte) length;
        i(iM, 4, bArr2);
        i(iM + 4, length, bArr);
        n(this.x, this.y + 1, z ? iM : this.z.a, iM);
        this.A = qnHx2;
        this.y++;
        if (z) {
            this.z = qnHx2;
        }
    }

    public final void c(int i) throws IOException {
        int i2 = i + 4;
        int iJ = this.x - j();
        if (iJ >= i2) {
            return;
        }
        int i3 = this.x;
        do {
            iJ += i3;
            i3 <<= 1;
        } while (iJ < i2);
        RandomAccessFile randomAccessFile = this.w;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        QnHx qnHx = this.A;
        int iM = m(qnHx.a + 4 + qnHx.b);
        if (iM < this.z.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.x);
            long j = iM - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.A.a;
        int i5 = this.z.a;
        if (i4 < i5) {
            int i6 = (this.x + i4) - 16;
            n(i3, this.y, i5, i6);
            this.A = new QnHx(i6, this.A.b);
        } else {
            n(i3, this.y, i5, i4);
        }
        this.x = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.w.close();
    }

    public final QnHx e(int i) throws IOException {
        if (i == 0) {
            return QnHx.c;
        }
        RandomAccessFile randomAccessFile = this.w;
        randomAccessFile.seek(i);
        return new QnHx(i, randomAccessFile.readInt());
    }

    public final synchronized void g() {
        int i;
        try {
            synchronized (this) {
                i = this.y;
            }
        } catch (Throwable th) {
            throw th;
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        if (i == 1) {
            synchronized (this) {
                n(4096, 0, 0, 0);
                this.y = 0;
                QnHx qnHx = QnHx.c;
                this.z = qnHx;
                this.A = qnHx;
                if (this.x > 4096) {
                    RandomAccessFile randomAccessFile = this.w;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.x = 4096;
            }
        } else {
            QnHx qnHx2 = this.z;
            int iM = m(qnHx2.a + 4 + qnHx2.b);
            h(iM, 0, 4, this.B);
            int iF = f(0, this.B);
            n(this.x, this.y - 1, iM, this.A.a);
            this.y--;
            this.z = new QnHx(iM, iF);
        }
    }

    public final void h(int i, int i2, int i3, byte[] bArr) throws IOException {
        int iM = m(i);
        int i4 = iM + i3;
        int i5 = this.x;
        RandomAccessFile randomAccessFile = this.w;
        if (i4 <= i5) {
            randomAccessFile.seek(iM);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iM;
        randomAccessFile.seek(iM);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void i(int i, int i2, byte[] bArr) throws IOException {
        int iM = m(i);
        int i3 = iM + i2;
        int i4 = this.x;
        RandomAccessFile randomAccessFile = this.w;
        if (i3 <= i4) {
            randomAccessFile.seek(iM);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iM;
        randomAccessFile.seek(iM);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, 0 + i5, i2 - i5);
    }

    public final int j() {
        if (this.y == 0) {
            return 16;
        }
        QnHx qnHx = this.A;
        int i = qnHx.a;
        int i2 = this.z.a;
        return i >= i2 ? (i - i2) + 4 + qnHx.b + 16 : (((i + 4) + qnHx.b) + this.x) - i2;
    }

    public final int m(int i) {
        int i2 = this.x;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void n(int i, int i2, int i3, int i4) throws IOException {
        int i5 = 0;
        int[] iArr = {i, i2, i3, i4};
        int i6 = 0;
        while (true) {
            byte[] bArr = this.B;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.w;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                int i7 = iArr[i5];
                bArr[i6] = (byte) (i7 >> 24);
                bArr[i6 + 1] = (byte) (i7 >> 16);
                bArr[i6 + 2] = (byte) (i7 >> 8);
                bArr[i6 + 3] = (byte) i7;
                i6 += 4;
                i5++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(lh3.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.x);
        sb.append(", size=");
        sb.append(this.y);
        sb.append(", first=");
        sb.append(this.z);
        sb.append(", last=");
        sb.append(this.A);
        sb.append(", element lengths=[");
        try {
            synchronized (this) {
                int iM = this.z.a;
                boolean z = true;
                for (int i = 0; i < this.y; i++) {
                    QnHx qnHxE = e(iM);
                    new CQf(qnHxE);
                    int i2 = qnHxE.b;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i2);
                    iM = m(qnHxE.a + 4 + qnHxE.b);
                }
            }
        } catch (IOException e) {
            C.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final class CQf extends InputStream {
        public int w;
        public int x;

        public CQf(QnHx qnHx) {
            this.w = lh3.this.m(qnHx.a + 4);
            this.x = qnHx.b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.x;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.w;
            lh3 lh3Var = lh3.this;
            lh3Var.h(i4, i, i2, bArr);
            this.w = lh3Var.m(this.w + i2);
            this.x -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.x == 0) {
                return -1;
            }
            lh3 lh3Var = lh3.this;
            lh3Var.w.seek(this.w);
            int i = lh3Var.w.read();
            this.w = lh3Var.m(this.w + 1);
            this.x--;
            return i;
        }
    }
}
