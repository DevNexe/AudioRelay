package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1609u1 extends AbstractC1613v1 {
    public final /* synthetic */ int c;
    private final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1609u1(E0 e0, Object obj) {
        this(e0, obj, 0);
        this.c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1609u1(F0 f0, Object obj, int i) {
        super(f0);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1609u1(F0 f0, Object[] objArr) {
        this(f0, objArr, 1);
        this.c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609u1(C1609u1 c1609u1, E0 e0, int i) {
        super(c1609u1, e0, i);
        this.c = 0;
        this.d = c1609u1.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609u1(C1609u1 c1609u1, F0 f0, int i) {
        super(c1609u1, f0, i);
        this.c = 1;
        this.d = (Object[]) c1609u1.d;
    }

    @Override // j$.util.stream.AbstractC1613v1
    final void a() {
        switch (this.c) {
            case 0:
                ((E0) this.a).c(this.b, this.d);
                break;
            default:
                this.a.e((Object[]) this.d, this.b);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC1613v1
    final C1609u1 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new C1609u1(this, ((E0) this.a).a(i), i2);
            default:
                return new C1609u1(this, this.a.a(i), i2);
        }
    }
}
