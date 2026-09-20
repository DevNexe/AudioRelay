package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lz implements pg3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lz(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pg3
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qz qzVar = (qz) obj2;
                ry ryVar = (ry) obj;
                qzVar.getClass();
                return ryVar.f.a(new cq3(ryVar, qzVar));
            default:
                return new uc1((Context) obj2, (String) obj);
        }
    }
}
