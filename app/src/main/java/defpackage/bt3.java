package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class bt3 extends dx4.QnHx {
    public cf0 b;
    public final QnHx c;

    public static class CQf {
        public final boolean a;
        public final String b;

        public CQf(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public static abstract class QnHx {
        public final int a = 12;

        public abstract void a(r61 r61Var);

        public abstract CQf b(r61 r61Var);
    }

    public bt3(cf0 cf0Var, WorkDatabase_Impl.QnHx qnHx) {
        super(qnHx.a);
        this.b = cf0Var;
        this.c = qnHx;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[LOOP:4: B:11:0x0020->B:38:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:5: B:22:0x0045->B:98:?, LOOP_END, SYNTHETIC] */
    @Override // dx4.QnHx
    public final void b(r61 r61Var, int i, int i2) {
        boolean z;
        List listEmptyList;
        TreeMap<Integer, lg2> treeMap;
        Set<Integer> setKeySet;
        Iterator<Integer> it;
        int iIntValue;
        boolean z2;
        cf0 cf0Var = this.b;
        QnHx qnHx = this.c;
        if (cf0Var != null) {
            at3.F1 f1 = cf0Var.d;
            f1.getClass();
            z = true;
            if (i == i2) {
                listEmptyList = Collections.emptyList();
            } else {
                boolean z3 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int i3 = i;
                while (true) {
                    if (z3) {
                        if (i3 < i2) {
                            treeMap = f1.a.get(Integer.valueOf(i3));
                            if (treeMap != null) {
                                if (z3) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        iIntValue = it.next().intValue();
                                        if (z3 ? !(iIntValue < i2 || iIntValue >= i3) : !(iIntValue > i2 || iIntValue <= i3)) {
                                            arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        iIntValue = i3;
                                        z2 = false;
                                        break;
                                    }
                                }
                                if (!z2) {
                                    i3 = iIntValue;
                                }
                            }
                            listEmptyList = null;
                        } else {
                            listEmptyList = arrayList;
                        }
                    } else if (i3 > i2) {
                        treeMap = f1.a.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            if (z3) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    iIntValue = it.next().intValue();
                                    if (z3 ? !(iIntValue < i2 || iIntValue >= i3) : !(iIntValue > i2 || iIntValue <= i3)) {
                                        arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    iIntValue = i3;
                                    z2 = false;
                                    break;
                                }
                            }
                            if (!z2) {
                                i3 = iIntValue;
                            }
                        }
                        listEmptyList = null;
                    } else {
                        listEmptyList = arrayList;
                    }
                }
            }
            if (listEmptyList != null) {
                ((WorkDatabase_Impl.QnHx) qnHx).getClass();
                ArrayList<String> arrayList2 = new ArrayList();
                Cursor cursorG = r61Var.g("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorG.moveToNext()) {
                    try {
                        arrayList2.add(cursorG.getString(0));
                    } catch (Throwable th) {
                        cursorG.close();
                        throw th;
                    }
                }
                cursorG.close();
                for (String str : arrayList2) {
                    if (str.startsWith("room_fts_content_sync_")) {
                        r61Var.e("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    ((lg2) it2.next()).a(r61Var);
                }
                CQf cQfB = qnHx.b(r61Var);
                if (!cQfB.a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + cQfB.b);
                }
                c(r61Var);
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        cf0 cf0Var2 = this.b;
        if (cf0Var2 == null || cf0Var2.a(i, i2)) {
            throw new IllegalStateException(bj0.a("A migration from ", i, " to ", i2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        WorkDatabase_Impl.QnHx qnHx2 = (WorkDatabase_Impl.QnHx) qnHx;
        qnHx2.getClass();
        r61Var.e("DROP TABLE IF EXISTS `Dependency`");
        r61Var.e("DROP TABLE IF EXISTS `WorkSpec`");
        r61Var.e("DROP TABLE IF EXISTS `WorkTag`");
        r61Var.e("DROP TABLE IF EXISTS `SystemIdInfo`");
        r61Var.e("DROP TABLE IF EXISTS `WorkName`");
        r61Var.e("DROP TABLE IF EXISTS `WorkProgress`");
        r61Var.e("DROP TABLE IF EXISTS `Preference`");
        int i4 = WorkDatabase_Impl.s;
        WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
        List<at3.CQf> list = workDatabase_Impl.g;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                workDatabase_Impl.g.get(i5).getClass();
            }
        }
        qnHx.a(r61Var);
    }

    public final void c(r61 r61Var) {
        r61Var.e("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        r61Var.e("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}
