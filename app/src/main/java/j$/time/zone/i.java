package j$.time.zone;

import com.google.android.gms.ads.AdRequest;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    private static final CopyOnWriteArrayList a;
    private static final ConcurrentHashMap b;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        a = copyOnWriteArrayList;
        b = new ConcurrentHashMap(AdRequest.MAX_CONTENT_URL_LENGTH, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected i() {
    }

    public static HashSet a() {
        return new HashSet(b.keySet());
    }

    public static ZoneRules b(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("zoneId");
        }
        ConcurrentHashMap concurrentHashMap = b;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar != null) {
            return iVar.c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new f("No time-zone data files registered");
        }
        throw new f("Unknown time-zone ID: ".concat(str));
    }

    public static void e(i iVar) {
        if (iVar == null) {
            throw new NullPointerException("provider");
        }
        for (String str : iVar.d()) {
            if (str == null) {
                throw new NullPointerException("zoneId");
            }
            if (((i) b.putIfAbsent(str, iVar)) != null) {
                throw new f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
            }
        }
        a.add(iVar);
    }

    protected abstract ZoneRules c(String str);

    protected abstract Set d();
}
