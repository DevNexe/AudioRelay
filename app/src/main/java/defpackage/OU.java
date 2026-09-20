package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.CQf;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class OU implements CSv {
    public static volatile OU c;
    public final VV a;
    public final ConcurrentHashMap b;

    public OU(VV vv) {
        oa3.h(vv);
        this.a = vv;
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.CSv
    public final Map<String, Object> a(boolean z) {
        return this.a.a.h(null, null, z);
    }

    @Override // defpackage.CSv
    public final void b(Bundle bundle, String str, String str2) {
        if ((!a76.c.contains(str)) && a76.b(bundle, str2) && a76.a(bundle, str, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            CQf cQf = this.a.a;
            cQf.getClass();
            cQf.c(new ve6(cQf, str, str2, bundle, true));
        }
    }

    @Override // defpackage.CSv
    public final UFS c(String str, cb0 cb0Var) {
        Object vq6Var;
        if (!(!a76.c.contains(str))) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.b;
        if ((zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) ? false : true) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        VV vv = this.a;
        if (zEquals) {
            vq6Var = new fg6(vv, cb0Var);
        } else {
            vq6Var = ("crash".equals(str) || "clx".equals(str)) ? new vq6(vv, cb0Var) : null;
        }
        if (vq6Var == null) {
            return null;
        }
        concurrentHashMap.put(str, vq6Var);
        return new UFS();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x010d  */
    @Override // defpackage.CSv
    public final void d(CSv.CQf cQf) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        HashSet hashSet = a76.a;
        String str5 = cQf.a;
        boolean z2 = false;
        if (str5 != null && !str5.isEmpty()) {
            Object obj = cQf.c;
            if (obj != null) {
                Object obj2 = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeObject(obj);
                            objectOutputStream.flush();
                            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                            try {
                                Object object = objectInputStream.readObject();
                                objectOutputStream.close();
                                objectInputStream.close();
                                obj2 = object;
                                if (obj2 != null) {
                                    if (!a76.c.contains(str5)) {
                                        str = cQf.b;
                                        if (!"_ce1".equals(str) || "_ce2".equals(str)) {
                                            if (!str5.equals("fcm") || str5.equals("frc")) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else if (!"_ln".equals(str)) {
                                            if (!a76.e.contains(str)) {
                                                Iterator it = a76.f.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        z = true;
                                                    } else if (str.matches((String) it.next())) {
                                                    }
                                                }
                                            }
                                            z = false;
                                        } else if (str5.equals("fcm") || str5.equals("fiam")) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            str2 = cQf.k;
                                            if (str2 == null) {
                                                str3 = cQf.h;
                                                if (str3 == null) {
                                                    str4 = cQf.f;
                                                    if (str4 == null) {
                                                        z2 = true;
                                                    } else if (a76.b(cQf.g, str4)) {
                                                        if (a76.a(cQf.g, str5, cQf.f)) {
                                                            z2 = true;
                                                        }
                                                    }
                                                } else if (a76.b(cQf.i, str3)) {
                                                    if (a76.a(cQf.i, str5, cQf.h)) {
                                                        str4 = cQf.f;
                                                        if (str4 == null) {
                                                            z2 = true;
                                                        } else if (a76.b(cQf.g, str4)) {
                                                            if (a76.a(cQf.g, str5, cQf.f)) {
                                                                z2 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (a76.b(cQf.l, str2)) {
                                                if (a76.a(cQf.l, str5, cQf.k)) {
                                                    str3 = cQf.h;
                                                    if (str3 == null) {
                                                        str4 = cQf.f;
                                                        if (str4 == null) {
                                                            z2 = true;
                                                        } else if (a76.b(cQf.g, str4)) {
                                                            if (a76.a(cQf.g, str5, cQf.f)) {
                                                                z2 = true;
                                                            }
                                                        }
                                                    } else if (a76.b(cQf.i, str3)) {
                                                        if (a76.a(cQf.i, str5, cQf.h)) {
                                                            str4 = cQf.f;
                                                            if (str4 == null) {
                                                                z2 = true;
                                                            } else if (a76.b(cQf.g, str4)) {
                                                                if (a76.a(cQf.g, str5, cQf.f)) {
                                                                    z2 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                if (objectInputStream == null) {
                                    throw th;
                                }
                                objectInputStream.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            objectInputStream = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        objectInputStream = null;
                        objectOutputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            } else if (!a76.c.contains(str5)) {
                str = cQf.b;
                if ("_ce1".equals(str)) {
                    if (str5.equals("fcm")) {
                    }
                    z = true;
                    if (z) {
                        str2 = cQf.k;
                        if (str2 == null) {
                            str3 = cQf.h;
                            if (str3 == null) {
                                str4 = cQf.f;
                                if (str4 == null) {
                                    z2 = true;
                                } else if (a76.b(cQf.g, str4)) {
                                    if (a76.a(cQf.g, str5, cQf.f)) {
                                        z2 = true;
                                    }
                                }
                            } else if (a76.b(cQf.i, str3)) {
                                if (a76.a(cQf.i, str5, cQf.h)) {
                                    str4 = cQf.f;
                                    if (str4 == null) {
                                        z2 = true;
                                    } else if (a76.b(cQf.g, str4)) {
                                        if (a76.a(cQf.g, str5, cQf.f)) {
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                        } else if (a76.b(cQf.l, str2)) {
                            if (a76.a(cQf.l, str5, cQf.k)) {
                                str3 = cQf.h;
                                if (str3 == null) {
                                    str4 = cQf.f;
                                    if (str4 == null) {
                                        z2 = true;
                                    } else if (a76.b(cQf.g, str4)) {
                                        if (a76.a(cQf.g, str5, cQf.f)) {
                                            z2 = true;
                                        }
                                    }
                                } else if (a76.b(cQf.i, str3)) {
                                    if (a76.a(cQf.i, str5, cQf.h)) {
                                        str4 = cQf.f;
                                        if (str4 == null) {
                                            z2 = true;
                                        } else if (a76.b(cQf.g, str4)) {
                                            if (a76.a(cQf.g, str5, cQf.f)) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (str5.equals("fcm")) {
                    }
                    z = true;
                    if (z) {
                        str2 = cQf.k;
                        if (str2 == null) {
                            str3 = cQf.h;
                            if (str3 == null) {
                                str4 = cQf.f;
                                if (str4 == null) {
                                    z2 = true;
                                } else if (a76.b(cQf.g, str4)) {
                                    if (a76.a(cQf.g, str5, cQf.f)) {
                                        z2 = true;
                                    }
                                }
                            } else if (a76.b(cQf.i, str3)) {
                                if (a76.a(cQf.i, str5, cQf.h)) {
                                    str4 = cQf.f;
                                    if (str4 == null) {
                                        z2 = true;
                                    } else if (a76.b(cQf.g, str4)) {
                                        if (a76.a(cQf.g, str5, cQf.f)) {
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                        } else if (a76.b(cQf.l, str2)) {
                            if (a76.a(cQf.l, str5, cQf.k)) {
                                str3 = cQf.h;
                                if (str3 == null) {
                                    str4 = cQf.f;
                                    if (str4 == null) {
                                        z2 = true;
                                    } else if (a76.b(cQf.g, str4)) {
                                        if (a76.a(cQf.g, str5, cQf.f)) {
                                            z2 = true;
                                        }
                                    }
                                } else if (a76.b(cQf.i, str3)) {
                                    if (a76.a(cQf.i, str5, cQf.h)) {
                                        str4 = cQf.f;
                                        if (str4 == null) {
                                            z2 = true;
                                        } else if (a76.b(cQf.g, str4)) {
                                            if (a76.a(cQf.g, str5, cQf.f)) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z2) {
            Bundle bundle = new Bundle();
            String str6 = cQf.a;
            if (str6 != null) {
                bundle.putString("origin", str6);
            }
            String str7 = cQf.b;
            if (str7 != null) {
                bundle.putString(MediationMetaData.KEY_NAME, str7);
            }
            Object obj3 = cQf.c;
            if (obj3 != null) {
                Th.W(bundle, obj3);
            }
            String str8 = cQf.d;
            if (str8 != null) {
                bundle.putString("trigger_event_name", str8);
            }
            bundle.putLong("trigger_timeout", cQf.e);
            String str9 = cQf.f;
            if (str9 != null) {
                bundle.putString("timed_out_event_name", str9);
            }
            Bundle bundle2 = cQf.g;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str10 = cQf.h;
            if (str10 != null) {
                bundle.putString("triggered_event_name", str10);
            }
            Bundle bundle3 = cQf.i;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", cQf.j);
            String str11 = cQf.k;
            if (str11 != null) {
                bundle.putString("expired_event_name", str11);
            }
            Bundle bundle4 = cQf.l;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", cQf.m);
            bundle.putBoolean("active", cQf.n);
            bundle.putLong("triggered_timestamp", cQf.o);
            CQf cQf2 = this.a.a;
            cQf2.getClass();
            cQf2.c(new nd6(cQf2, bundle, 2));
        }
    }

    @Override // defpackage.CSv
    public final int e(String str) {
        return this.a.a.d(str);
    }

    @Override // defpackage.CSv
    public final void f(String str) {
        CQf cQf = this.a.a;
        cQf.getClass();
        cQf.c(new va6(cQf, str, null, null));
    }

    @Override // defpackage.CSv
    public final ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.a.g(str, "")) {
            HashSet hashSet = a76.a;
            oa3.h(bundle);
            CSv.CQf cQf = new CSv.CQf();
            String str2 = (String) Th.Q(bundle, "origin", String.class, null);
            oa3.h(str2);
            cQf.a = str2;
            String str3 = (String) Th.Q(bundle, MediationMetaData.KEY_NAME, String.class, null);
            oa3.h(str3);
            cQf.b = str3;
            cQf.c = Th.Q(bundle, "value", Object.class, null);
            cQf.d = (String) Th.Q(bundle, "trigger_event_name", String.class, null);
            cQf.e = ((Long) Th.Q(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cQf.f = (String) Th.Q(bundle, "timed_out_event_name", String.class, null);
            cQf.g = (Bundle) Th.Q(bundle, "timed_out_event_params", Bundle.class, null);
            cQf.h = (String) Th.Q(bundle, "triggered_event_name", String.class, null);
            cQf.i = (Bundle) Th.Q(bundle, "triggered_event_params", Bundle.class, null);
            cQf.j = ((Long) Th.Q(bundle, "time_to_live", Long.class, 0L)).longValue();
            cQf.k = (String) Th.Q(bundle, "expired_event_name", String.class, null);
            cQf.l = (Bundle) Th.Q(bundle, "expired_event_params", Bundle.class, null);
            cQf.n = ((Boolean) Th.Q(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cQf.m = ((Long) Th.Q(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cQf.o = ((Long) Th.Q(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cQf);
        }
        return arrayList;
    }
}
