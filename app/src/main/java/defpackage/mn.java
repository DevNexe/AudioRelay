package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mn extends cx1 implements j81<Map.Entry<rn, Object>, Map.Entry<String, Object>> {
    public static final mn w = new mn();

    public mn() {
        super(1);
    }

    @Override // defpackage.j81
    public final Map.Entry<String, Object> invoke(Map.Entry<rn, Object> entry) {
        Map.Entry<rn, Object> entry2 = entry;
        return new ot0(entry2.getKey().a, entry2.getValue());
    }
}
