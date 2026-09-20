package com.google.protobuf;

import com.google.protobuf.QnHx;
import com.google.protobuf.QnHx.AbstractC0099QnHx;
import com.google.protobuf.roZB;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class FA4<MType extends QnHx, BType extends QnHx.AbstractC0099QnHx, IType extends roZB> implements QnHx.CQf {
    public final QnHx.CQf a;
    public BType b;
    public MType c;
    public boolean d;

    public FA4(lPt3Fixed lpt3, lPt3Fixed.CQf.QnHx qnHx, boolean z) {
        Charset charset = SjP.a;
        lpt3.getClass();
        this.c = lpt3;
        this.a = qnHx;
        this.d = z;
    }

    @Override // com.google.protobuf.QnHx.CQf
    public final void a() {
        f();
    }

    public final MType b() {
        this.d = true;
        return (MType) d();
    }

    public final BType c() {
        if (this.b == null) {
            BType btype = (BType) this.c.E(this);
            this.b = btype;
            btype.s(this.c);
            this.b.u();
        }
        return this.b;
    }

    public final MType d() {
        if (this.c == null) {
            this.c = (MType) this.b.f();
        }
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(QnHx qnHx) {
        if (this.b == null) {
            mw0t mw0tVar = this.c;
            if (mw0tVar == mw0tVar.a()) {
                this.c = qnHx;
            } else {
                c().s(qnHx);
            }
        } else {
            c().s(qnHx);
        }
        f();
    }

    public final void f() {
        QnHx.CQf cQf;
        if (this.b != null) {
            this.c = null;
        }
        if (!this.d || (cQf = this.a) == null) {
            return;
        }
        cQf.a();
        this.d = false;
    }
}
