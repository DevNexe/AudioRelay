package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class oh2 implements yz2 {
    public long A = -1;
    public final CQf B = CQf.w;
    public final int w;
    public final int x;
    public final ByteBuffer y;
    public final e8 z;

    public static final class CQf extends cx1 implements j81<qk, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(qk qkVar) {
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<qk, sd5> {
        public final /* synthetic */ j81<qk, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(j81<? super qk, sd5> j81Var) {
            super(1);
            this.x = j81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(qk qkVar) {
            qk qkVar2 = qkVar;
            oh2 oh2Var = oh2.this;
            ByteBuffer byteBuffer = oh2Var.y;
            int i = qkVar2.c;
            byteBuffer.putInt(i);
            ByteBuffer byteBuffer2 = oh2Var.y;
            byteBuffer2.put(qkVar2.a, qkVar2.b, i);
            byteBuffer2.position(0);
            int i2 = i + 4;
            byte[] bArr = new byte[i2];
            byteBuffer2.get(bArr, 0, i2);
            byteBuffer2.position(0);
            this.x.invoke(OW8.y(bArr, 0, 3));
            return sd5.a;
        }
    }

    public oh2(int i, int i2) {
        this.w = i;
        this.x = i2;
        this.y = ByteBuffer.allocateDirect(i);
        this.z = new e8(i - 4);
    }

    @Override // defpackage.yz2
    public final void a(qk qkVar, j81<? super qk, sd5> j81Var) {
        if (this.A == -1) {
            this.A = zs.QnHx.a.c();
        }
        if (!((((zs.QnHx.a.c() - this.A) > ((long) this.x) ? 1 : ((zs.QnHx.a.c() - this.A) == ((long) this.x) ? 0 : -1)) >= 0) || (this.z.b.remaining() + qkVar.c) + 4 >= this.w)) {
            this.z.a(qkVar, false, this.B);
        } else {
            this.z.a(qkVar, true, new QnHx(j81Var));
            this.A = zs.QnHx.a.c();
        }
    }
}
