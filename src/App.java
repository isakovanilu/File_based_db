import Entities.AcademyGroup;
import Repository.AcademyGroupFileRepository;
import Repository.IRepository;

public class App {
    public static void main(String[] args) throws Exception {
        IRepository<AcademyGroup> groupRepository = new AcademyGroupFileRepository("group.file");
        groupRepository.Add(new AcademyGroup(0, "Group 2024"));
        groupRepository.Add(new AcademyGroup(1, "Group 2025"));
        groupRepository.Add(new AcademyGroup(2, "Group 2026"));
        groupRepository.Add(new AcademyGroup(3, "Group 2027"));

        for(AcademyGroup group: groupRepository.GetAll()){
            System.out.println(group.getId() + ", " + group.getGroupName());
        }
    }
}