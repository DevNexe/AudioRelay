package j$.util.stream;

import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
final class V2 {
    public static final V2 DISTINCT;
    public static final V2 ORDERED;
    public static final V2 SHORT_CIRCUIT;
    public static final V2 SIZED;
    public static final V2 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    static final int u;
    private static final /* synthetic */ V2[] v;
    private final Map a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        U2 u2 = U2.SPLITERATOR;
        T2 t2G = G(u2);
        U2 u3 = U2.STREAM;
        t2G.a(u3);
        U2 u4 = U2.OP;
        t2G.a.put(u4, 3);
        V2 v2 = new V2("DISTINCT", 0, 0, t2G);
        DISTINCT = v2;
        T2 t2G2 = G(u2);
        t2G2.a(u3);
        t2G2.a.put(u4, 3);
        V2 v3 = new V2("SORTED", 1, 1, t2G2);
        SORTED = v3;
        T2 t2G3 = G(u2);
        t2G3.a(u3);
        Map map = t2G3.a;
        map.put(u4, 3);
        U2 u5 = U2.TERMINAL_OP;
        map.put(u5, 2);
        U2 u6 = U2.UPSTREAM_TERMINAL_OP;
        map.put(u6, 2);
        V2 v4 = new V2("ORDERED", 2, 2, t2G3);
        ORDERED = v4;
        T2 t2G4 = G(u2);
        t2G4.a(u3);
        t2G4.a.put(u4, 2);
        V2 v5 = new V2("SIZED", 3, 3, t2G4);
        SIZED = v5;
        T2 t2G5 = G(u4);
        t2G5.a(u5);
        V2 v6 = new V2("SHORT_CIRCUIT", 4, 12, t2G5);
        SHORT_CIRCUIT = v6;
        v = new V2[]{v2, v3, v4, v5, v6};
        f = k(u2);
        g = k(u3);
        h = k(u4);
        k(u5);
        k(u6);
        int i2 = 0;
        for (V2 v7 : values()) {
            i2 |= v7.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        V2 v8 = DISTINCT;
        m = v8.c;
        n = v8.d;
        V2 v9 = SORTED;
        o = v9.c;
        p = v9.d;
        V2 v10 = ORDERED;
        q = v10.c;
        r = v10.d;
        V2 v11 = SIZED;
        s = v11.c;
        t = v11.d;
        u = SHORT_CIRCUIT.c;
    }

    private V2(String str, int i2, int i3, T2 t2) {
        super(str, i2);
        U2[] u2ArrValues = U2.values();
        int length = u2ArrValues.length;
        int i4 = 0;
        while (true) {
            Map map = t2.a;
            if (i4 >= length) {
                this.a = map;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
            j$.util.Map.EL.a(map, u2ArrValues[i4], 0);
            i4++;
        }
    }

    private static T2 G(U2 u2) {
        T2 t2 = new T2(new EnumMap(U2.class));
        t2.a(u2);
        return t2;
    }

    static int M(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    static int j(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    private static int k(U2 u2) {
        int iIntValue = 0;
        for (V2 v2 : values()) {
            iIntValue |= ((Integer) v2.a.get(u2)).intValue() << v2.b;
        }
        return iIntValue;
    }

    static int l(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static V2 valueOf(String str) {
        return (V2) Enum.valueOf(V2.class, str);
    }

    public static V2[] values() {
        return (V2[]) v.clone();
    }

    final boolean p(int i2) {
        return (i2 & this.e) == this.c;
    }

    final boolean z(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }
}
