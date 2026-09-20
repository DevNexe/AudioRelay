package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G0 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ G0(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    @Override // j$.util.function.Predicate
    public final Predicate a(Predicate predicate) {
        int i = 0;
        switch (this.a) {
            case 0:
                predicate.getClass();
                break;
            default:
                predicate.getClass();
                break;
        }
        return new G0(this, predicate, i);
    }

    @Override // j$.util.function.Predicate
    public final Predicate b(Predicate predicate) {
        int i = 1;
        switch (this.a) {
            case 0:
                predicate.getClass();
                break;
            default:
                predicate.getClass();
                break;
        }
        return new G0(this, predicate, i);
    }

    @Override // j$.util.function.Predicate
    public final Predicate negate() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return new H0(this);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Predicate predicate = this.c;
        Predicate predicate2 = this.b;
        switch (i) {
            case 0:
                return j$.time.a.b(predicate2, predicate, obj);
            default:
                return predicate2.test(obj) || predicate.test(obj);
        }
    }
}
