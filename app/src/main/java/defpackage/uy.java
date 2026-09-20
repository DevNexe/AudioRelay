package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy implements z24.CQf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // z24.CQf
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.CQf cQf = componentActivity.E;
                cQf.getClass();
                HashMap map = cQf.c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(cQf.e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) cQf.h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", cQf.a);
                return bundle;
            default:
                return u24.a((u24) obj);
        }
    }
}
