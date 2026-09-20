package defpackage;

import com.google.android.gms.internal.measurement.vDR;
import com.google.android.gms.internal.measurement.zzko;
import defpackage.p17;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class p17<MessageType extends vDR<MessageType, BuilderType>, BuilderType extends p17<MessageType, BuilderType>> extends sy6<MessageType, BuilderType> {
    public final vDR w;
    public vDR x;
    public boolean y = false;

    public p17(MessageType messagetype) {
        this.w = messagetype;
        this.x = (vDR) messagetype.q(4);
    }

    @Override // defpackage.r37
    public final /* synthetic */ vDR c() {
        return this.w;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final p17 clone() {
        p17 p17Var = (p17) this.w.q(5);
        p17Var.k(o());
        return p17Var;
    }

    public final void k(vDR vdr) {
        if (this.y) {
            p();
            this.y = false;
        }
        vDR vdr2 = this.x;
        v37.c.a(vdr2.getClass()).b(vdr2, vdr);
    }

    public final void l(byte[] bArr, int i, q07 q07Var) throws zzko {
        if (this.y) {
            p();
            this.y = false;
        }
        try {
            v37.c.a(this.x.getClass()).d(this.x, bArr, 0, i, new at6(q07Var));
        } catch (zzko e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzko.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType n() {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.vDR r0 = r3.o()
            r1 = 1
            java.lang.Object r2 = r0.q(r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r1) goto L12
            goto L28
        L12:
            if (r2 == 0) goto L29
            v37 r1 = defpackage.v37.c
            java.lang.Class r2 = r0.getClass()
            y37 r1 = r1.a(r2)
            boolean r1 = r1.a(r0)
            r2 = 2
            r0.q(r2)
            if (r1 == 0) goto L29
        L28:
            return r0
        L29:
            com.google.android.gms.internal.measurement.zzmm r0 = new com.google.android.gms.internal.measurement.zzmm
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p17.n():com.google.android.gms.internal.measurement.vDR");
    }

    public final MessageType o() {
        if (this.y) {
            return (MessageType) this.x;
        }
        vDR vdr = this.x;
        v37.c.a(vdr.getClass()).zzf(vdr);
        this.y = true;
        return (MessageType) this.x;
    }

    public final void p() {
        vDR vdr = (vDR) this.x.q(4);
        v37.c.a(vdr.getClass()).b(vdr, this.x);
        this.x = vdr;
    }
}
