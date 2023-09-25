package home1;

import java.util.ArrayList;

public class GroupService {

    private ArrayList<Group> groups = new ArrayList<>();

        public void create(int id, String name) {
            Group group = new Group(id, name);
            groups.add(group);
        }

        public ArrayList<Group> findAll() {
            return groups;
        }

        public void delete(int id) {
            for (int i = 0; i < groups.size(); i++) {
                if (groups.get(i).getId() == id) {
                    groups.remove(i);
                    break;
                }
            }
        }

        public void update(int id, String name) {
            for (Group group : groups) {
                if (group.getId() == id) {
                    group.setName(name);
                    break;
                }
            }
        }


    }


