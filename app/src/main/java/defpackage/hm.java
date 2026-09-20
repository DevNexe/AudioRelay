package defpackage;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
public final class hm<T1, T2, R> implements ba<T1, T2, R> {
    public final /* synthetic */ Wh w;

    public hm(Wh wh) {
        this.w = wh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ba
    public final R apply(T1 t1, T2 t2) throws Exception {
        Sb1 sb1 = (Sb1) t1;
        Wh wh = this.w;
        wh.getClass();
        int i = sb1.a;
        int iM = XTd3.m(sb1);
        XTd3.j(sb1);
        int iA = (int) (((long) wh.c.a()) * ((long) ((sb1.b / 8) * sb1.c)));
        int iM2 = XTd3.m(sb1);
        XTd3.j(sb1);
        return (R) new di(sb1, i, iM, iA, AudioRecord.getMinBufferSize(sb1.a, iM2, 2), ((oe2) t2).a);
    }
}
