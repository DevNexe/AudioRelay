package j$.util.stream;

import j$.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1585o0 extends AbstractC1600s0 {
    final /* synthetic */ EnumC1604t0 c;
    final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1585o0(Predicate predicate, EnumC1604t0 enumC1604t0) {
        super(enumC1604t0);
        this.c = enumC1604t0;
        this.d = predicate;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC1604t0 enumC1604t0 = this.c;
        if (zTest == enumC1604t0.a) {
            this.a = true;
            this.b = enumC1604t0.b;
        }
    }
}
