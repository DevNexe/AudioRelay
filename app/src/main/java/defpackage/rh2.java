package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rh2 implements a03 {
    public final c2 w;

    public rh2() {
        gq0.QnHx qnHx = gq0.x;
        this.w = new c2(ps0.o0(5, kq0.MINUTES));
    }

    @Override // defpackage.a03
    public final void b(ByteBuffer byteBuffer, j81<? super List<byte[]>, sd5> j81Var) {
        String strE;
        int iPosition = byteBuffer.position();
        int i = 0;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                if (i != 0) {
                    break;
                }
                a62.a.l("Found no payload");
                break;
            }
            int i2 = byteBuffer.getInt();
            boolean z = i2 < 0;
            boolean z2 = i2 > byteBuffer.remaining();
            if (z || z2) {
                if (z) {
                    strE = GM.a("Invalid payload. Found a negative size: ", i2);
                } else {
                    if (!z2) {
                        throw new IllegalStateException("Invalid, check the code".toString());
                    }
                    strE = Md5A.e("Invalid payload. Size superior to remaining data: ", i2, " > ", byteBuffer.remaining());
                }
                a62.a.a(strE);
                this.w.a(new qh2(strE));
                i = 0;
                break;
            }
            if (i2 != 0) {
                byteBuffer.position(byteBuffer.position() + i2);
                i++;
            }
        }
        if (i == 0) {
            return;
        }
        byteBuffer.position(iPosition);
        ArrayList arrayList = new ArrayList(i);
        int i3 = 0;
        while (byteBuffer.hasRemaining()) {
            int i4 = byteBuffer.getInt();
            if (i4 != 0) {
                byte[] bArr = new byte[i4];
                byteBuffer.get(bArr, 0, i4);
                arrayList.add(i3, bArr);
                i3++;
            }
        }
        j81Var.invoke(arrayList);
    }
}
