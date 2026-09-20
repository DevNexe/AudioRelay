package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements j$.time.temporal.r {
    public final /* synthetic */ int a;

    @Override // j$.time.temporal.r
    public final Object g(j$.time.temporal.l lVar) {
        switch (this.a) {
            case 0:
                return LocalDateTime.N(lVar);
            default:
                return OffsetDateTime.M(lVar);
        }
    }
}
